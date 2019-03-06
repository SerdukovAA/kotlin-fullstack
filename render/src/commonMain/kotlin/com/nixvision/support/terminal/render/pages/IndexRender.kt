package com.nixvision.support.terminal.render.pages

import com.nixvision.support.terminal.render.components.mainHead
import com.nixvision.support.terminal.render.components.mainLayoutWithTitleBar
import com.nixvision.support.terminal.render.lib.ModelAndView
import kotlinx.html.div
import kotlinx.html.html
import kotlinx.html.stream.createHTML

object IndexRender {

    fun indexPage(): ModelAndView {

        val html =  createHTML().html {

            mainHead()

            mainLayoutWithTitleBar {
                    div { + "Index Content" }
            }
        }

        return ModelAndView(html)
    }

}


