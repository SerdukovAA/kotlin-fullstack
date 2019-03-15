package com.nixvision.support.terminal.render.pages.users

import com.nixvision.support.terminal.api.user.UserDTO



expect object UserRenderService {
    fun getAllUsers(): List<UserDTO>
}

