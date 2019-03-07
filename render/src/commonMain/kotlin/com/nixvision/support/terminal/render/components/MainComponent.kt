package com.nixvision.support.terminal.render.components

import kotlinx.html.*


fun HTML.mainLayoutWithTitleBar(content : DIV.() -> Unit) {
    body{
        div{
            style = """ background-color:red """
            + "Left menu"
        }
        div("") {
            content()
        }
    }
}

