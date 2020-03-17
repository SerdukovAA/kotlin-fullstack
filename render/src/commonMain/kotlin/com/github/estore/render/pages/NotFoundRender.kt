package com.github.estore.render.pages

import com.github.estore.render.blocks.mainHead
import com.github.estore.render.blocks.mainLayoutWithTitleBar
import com.github.kotlin.isomorph.framework.ModelAndViewK
import kotlinx.html.div
import kotlinx.html.h1
import kotlinx.html.html
import kotlinx.html.stream.createHTML

object NotFoundRender {

    fun pageNotFound(): ModelAndViewK {
        val html = createHTML().html {
            mainHead()
            mainLayoutWithTitleBar {
                div {
                    h1 {+ "404 Not Found" }

                }
            }
        }
        return ModelAndViewK(html)
    }

}


