package com.nixvision.support.terminal.render.pages.users

import com.nixvision.support.terminal.render.components.mainHead
import com.nixvision.support.terminal.render.components.mainLayoutWithTitleBar
import com.nixvision.support.terminal.render.lib.ModelAndView
import kotlinx.html.div
import kotlinx.html.h1
import kotlinx.html.html
import kotlinx.html.stream.createHTML

object UserFormPage {

    fun page(): ModelAndView {
        val html = createHTML().html {
            mainHead()
            mainLayoutWithTitleBar {
                div {
                    h1 {+ "Users Content" }

                }
            }
        }
        return ModelAndView(html)
    }

}


