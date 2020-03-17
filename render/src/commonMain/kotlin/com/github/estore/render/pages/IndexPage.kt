package com.github.estore.render.pages

import com.github.estore.render.blocks.mainHead
import com.github.estore.render.blocks.mainLayoutWithTitleBar
import com.github.estore.render.lib.ModelAndView
import kotlinx.html.div
import kotlinx.html.h1
import kotlinx.html.html
import kotlinx.html.stream.createHTML

object IndexPage {

    fun indexPage(): ModelAndView {
        val html = createHTML().html {
            mainHead()
            mainLayoutWithTitleBar {
                div {
                    h1 {+ "Index Content" }

                }
            }
        }
        return ModelAndView(html)
    }

}


