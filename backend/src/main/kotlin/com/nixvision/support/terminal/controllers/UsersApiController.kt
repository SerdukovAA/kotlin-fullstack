package com.nixvision.support.terminal.controllers

import com.nixvision.support.terminal.api.user.UserDTO
import com.nixvision.support.terminal.services.UsersApiService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/users")
class UsersApiController (private val usersApiService: UsersApiService) {

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    fun getAllUsers(): List<UserDTO> {
        return usersApiService.getAllUsers()
    }


}

