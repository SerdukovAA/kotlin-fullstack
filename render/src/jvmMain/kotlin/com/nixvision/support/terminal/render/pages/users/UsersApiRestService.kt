package com.nixvision.support.terminal.render.pages.users

import com.nixvision.support.terminal.api.user.UserDTO
import com.nixvision.support.terminal.core.domains.user.UsersService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service

@Service
class UsersApiRestService {

    lateinit var userServices: UsersService

    @Autowired
    fun context(userServices: UsersService) {
        this.userServices = userServices
    }

    fun getAllUsers(): List<UserDTO> {
        return userServices.getAllUsers()
                .map { UserDTO(it.id, it.name) }
    }
}

