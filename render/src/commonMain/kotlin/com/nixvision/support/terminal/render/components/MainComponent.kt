package com.nixvision.support.terminal.render.components

import kotlinx.html.*


fun HTML.mainLayoutWithTitleBar(content : DIV.() -> Unit) {
    body{
        div{
            + "Left menu"
        }
        div("") {
            content()
        }
    }
}