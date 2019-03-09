import com.nixvision.support.terminal.render.pages.IndexPage
import org.w3c.dom.Document
import org.w3c.dom.asList
import org.w3c.dom.events.Event
import org.w3c.dom.get
import org.w3c.dom.parsing.DOMParser

import kotlin.browser.document

fun main() {

    val callback = fun (e: Event) {
        val links = document.getElementsByTagName("a")
        for ( item in links.asList()) {
            item.addEventListener("click", {
                it.preventDefault()

                 val doc: Document = DOMParser().parseFromString(IndexPage.indexPage().html, "text/xml")
                 val bodyHtml: String = doc.getElementsByTagName("body")[0]?.innerHTML ?: ""
                 document.body?.innerHTML = bodyHtml
            })
        }
    }

    document.addEventListener("DOMContentLoaded",callback)

}