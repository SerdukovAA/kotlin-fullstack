package com.nixvision.support.terminal.render.components

import kotlinx.html.*


fun HEAD.generalStyle() {
    //TODO лучше ссылка на файл
    style {
        unsafe {
            raw("""
                               div { border: 1px solid red;}
                        """)
        }
    }

}