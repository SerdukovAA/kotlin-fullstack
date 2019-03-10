import com.nixvision.support.terminal.render.lib.ModelAndView
import com.nixvision.support.terminal.render.lib.Routes.NOT_FOUND_URL
import com.nixvision.support.terminal.render.lib.RoutesHandler
import org.w3c.dom.Document
import org.w3c.dom.HTMLAnchorElement
import org.w3c.dom.events.MouseEvent
import org.w3c.dom.get
import org.w3c.dom.parsing.DOMParser
import kotlin.browser.document
import kotlin.browser.window


object Routing {
    fun run() {
        //listen links clicks events
        document.addEventListener("click", {
            if (it is MouseEvent && it.target is HTMLAnchorElement) {
                it.preventDefault()
                val lnk = it.target as HTMLAnchorElement
                var view: ModelAndView? = RoutesHandler.handle(lnk.pathname)
                if (view == null) {
                    view = RoutesHandler.handle(NOT_FOUND_URL)
                }
                val doc: Document = DOMParser().parseFromString(view?.html!!, "text/xml")
                //todo virtual dom, change only that needed to change
                val bodyHtml: String = doc.getElementsByTagName("body")[0]?.innerHTML ?: ""
                document.body?.innerHTML = bodyHtml
                window.history.pushState(null, "", lnk.pathname)
            }
        })
    }

}







