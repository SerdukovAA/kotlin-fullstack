package com.nixvision.support.terminal.core.domains.user

import com.nixvision.support.terminal.core.domains.user.model.User

interface UsersService{

   fun getAllUsers(): List<User>
}