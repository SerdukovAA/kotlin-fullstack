package com.github.estore.render.pages.users

import com.github.estore.render.blocks.mainHead
import com.github.estore.render.blocks.mainLayoutWithTitleBar
import com.github.estore.render.lib.ModelAndView
import kotlinx.html.*
import kotlinx.html.stream.createHTML

object UsersListPage {

    fun page(): ModelAndView {
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
        return ModelAndView(html)
    }

}


