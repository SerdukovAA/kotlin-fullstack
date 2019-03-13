package com.nixvision.support.terminal.core.domains.user

import com.nixvision.support.terminal.core.domains.user.model.User
import org.springframework.stereotype.Service

@Service
internal class UsersServiceImpl : UsersService {


    override fun getAllUsers(): List<User> {
        return listOf(User("Johe"), User("Nina"))
    }


}