package com.nixvision.support.terminal.render.pages.users

import com.nixvision.support.terminal.api.user.UserDTO



expect object UserRenderService {
    fun getAllUsers(): List<UserDTO>
}


/*
object UserRenderService {


    fun getAllUsers(): List<UserDTO> {

        return listOf(
                UserDTO(1, "Ванечка"),
                UserDTO(2, "Леночка"),
                UserDTO(3, "Сократ"),
                UserDTO(4, "Иринка"),
                UserDTO(45, "Колька Семенов")
        )
    }

}*/
