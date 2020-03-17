package com.github.estore.render.blocks

import kotlinx.html.*


fun HTML.mainHead() {
    head {
        unsafe {
            raw("""<meta charset="UTF-8"/>""")
        }
        script {
            src = "/main.bundle.js"
        }
        generalStyle()
    }
}