package com.github.estore.controllers

import com.github.estore.api.user.UserDTO
import com.github.estore.render.pages.users.UsersApiRestService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/users")
class UsersApiController (private val usersApiRestService: UsersApiRestService) {

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    fun getAllUsers(): List<UserDTO> {
        return usersApiRestService.getAllUsers()
    }


}

