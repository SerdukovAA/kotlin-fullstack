package com.github.estore.render.pages.users

import com.github.estore.render.blocks.mainHead
import com.github.estore.render.blocks.mainLayoutWithTitleBar
import com.github.kotlin.isomorph.framework.ModelAndViewK
import kotlinx.html.*
import kotlinx.html.stream.createHTML

object UsersListPage {

    fun page(): ModelAndViewK {
        val html = createHTML().html {
            mainHead()
            mainLayoutWithTitleBar {
                for(user in UserRenderService.getAllUsers()){
                    div {
                        style = "border: solid 1px red;"
                        p {+ "Пользователь ID ${user.id} Имя ${user.name}" }

                    }
                }
            }
        }
        return ModelAndViewK(html)
    }

}


