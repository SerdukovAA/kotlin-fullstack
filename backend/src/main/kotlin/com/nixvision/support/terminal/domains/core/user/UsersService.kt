package com.nixvision.support.terminal.domains.core.user

import com.nixvision.support.terminal.domains.core.user.model.User

interface UsersService{

   fun getAllUsers(): List<User>
}