import com.nixvision.support.terminal.render.lib.ModelAndView
import com.nixvision.support.terminal.render.lib.RoutesHandler
import com.nixvision.support.terminal.render.lib.isFound
import org.w3c.dom.Document
import org.w3c.dom.HTMLAnchorElement
import org.w3c.dom.asList
import org.w3c.dom.events.Event
import org.w3c.dom.events.MouseEvent
import org.w3c.dom.get
import org.w3c.dom.parsing.DOMParser
import kotlin.browser.document
import kotlin.browser.window


object Routing{
      fun run(){
          //listen links clicks events
          document.addEventListener("click", {
              if(it is MouseEvent && it.target is HTMLAnchorElement) {
                  val lnk = it.target as HTMLAnchorElement
                  val view: ModelAndView = RoutesHandler.handle(lnk.pathname)
                  if (view.isFound()) {
                      it.preventDefault()
                      val doc: Document = DOMParser().parseFromString(view.html, "text/xml")
                      //todo virtual dom, change only that needed to change
                      val bodyHtml: String = doc.getElementsByTagName("body")[0]?.innerHTML ?: ""
                      document.body?.innerHTML = bodyHtml
                      window.history.pushState(null, "", lnk.pathname)
                  }
              }
          })

    }

}







