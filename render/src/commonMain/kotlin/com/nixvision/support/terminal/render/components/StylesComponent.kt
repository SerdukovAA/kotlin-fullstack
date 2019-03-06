package com.nixvision.support.terminal.render.components

import kotlinx.html.*


fun HEAD.generalStyle() {
    style {
        unsafe {
            raw("""
                               div { border: 1px solid red;}
                        """)
        }
    }

}