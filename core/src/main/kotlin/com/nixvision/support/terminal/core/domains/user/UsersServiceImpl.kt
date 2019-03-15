package com.nixvision.support.terminal.core.domains.user

import com.nixvision.support.terminal.core.domains.user.model.User
import org.springframework.stereotype.Service

@Service
internal class UsersServiceImpl : UsersService {


    override fun getAllUsers(): List<User> {
        return listOf(
                User(1, "JVM - Ванечка"),
                User(2, "Леночка"),
                User(3, "Сократ"),
                User(4, "Иринка"),
                User(45, "Колька Семенов")
        )
    }


}