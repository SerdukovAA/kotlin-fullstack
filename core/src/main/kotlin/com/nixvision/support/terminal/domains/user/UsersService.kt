package com.nixvision.support.terminal.domains.user

import com.nixvision.support.terminal.domains.user.model.User

interface UsersService{

   fun getAllUsers(): List<User>
}