package com.nixvision.support.terminal.domains.user

import com.nixvision.support.terminal.domains.user.model.User
import org.springframework.stereotype.Service

@Service
class UsersServiceImpl : UsersService {


    override fun getAllUsers(): List<User> {
        return listOf(User("Johe"), User("Nina"))
    }


}