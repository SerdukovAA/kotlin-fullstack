package com.nixvision.support.terminal.services

import com.nixvision.support.terminal.api.user.UserDTO
import com.nixvision.support.terminal.core.domains.user.UsersService
import org.springframework.stereotype.Service

@Service
class UsersApiService (private val usersService: UsersService){

    fun getAllUsers(): List<UserDTO>{
        return usersService.getAllUsers().map {UserDTO(it.name)}.toList()
    }
}