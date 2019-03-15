package com.nixvision.support.terminal.render.pages.users

import com.nixvision.support.terminal.api.user.UserDTO
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
actual object UserRenderService {

    lateinit var usersApiRestService: UsersApiRestService

    @Autowired
    fun context(usersApiRestService: UsersApiRestService) {
        this.usersApiRestService = usersApiRestService
    }

    actual fun getAllUsers(): List<UserDTO> {
        return usersApiRestService.getAllUsers()
                .map { UserDTO(it.id, it.name) }
    }
}

