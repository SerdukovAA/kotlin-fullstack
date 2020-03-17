package com.github.estore.render.pages.users

import com.github.estore.api.user.UserDTO



expect object UserRenderService {
    fun getAllUsers(): List<UserDTO>
}

