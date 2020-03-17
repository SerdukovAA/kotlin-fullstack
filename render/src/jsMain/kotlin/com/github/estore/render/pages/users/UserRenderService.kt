package com.github.estore.render.pages.users

import com.github.estore.api.user.UserDTO


actual object UserRenderService {

    actual fun getAllUsers(): List<UserDTO> {
        return listOf(
                UserDTO(1, "JS - Ванечка"),
                UserDTO(2, "Леночка"),
                UserDTO(3, "Сократ"),
                UserDTO(4, "Иринка"),
                UserDTO(45, "Колька Семенов")
        )
    }
}

