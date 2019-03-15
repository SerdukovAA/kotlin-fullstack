package com.nixvision.support.terminal.render.pages.users

import com.nixvision.support.terminal.render.components.mainHead
import com.nixvision.support.terminal.render.components.mainLayoutWithTitleBar
import com.nixvision.support.terminal.render.lib.ModelAndView
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


