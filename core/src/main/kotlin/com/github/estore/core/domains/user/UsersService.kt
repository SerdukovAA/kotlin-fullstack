package com.github.estore.core.domains.user

import com.github.estore.core.domains.user.model.User


interface UsersService{

   fun getAllUsers(): List<User>
}