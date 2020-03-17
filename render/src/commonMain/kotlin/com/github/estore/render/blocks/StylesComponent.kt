package com.github.estore.render.blocks

import kotlinx.html.*


fun HEAD.generalStyle() {
    //TODO лучше ссылка на файл
    style {
        unsafe {
            raw("""

                        """)
        }
    }

}