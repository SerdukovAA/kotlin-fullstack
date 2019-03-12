package com.nixvision.support.terminal.render.components

import kotlinx.html.HTML
import kotlinx.html.head
import kotlinx.html.script


fun HTML.mainHead() {
    head {
/*        script {
            src = "/kotlin.js"
        }*/
        script {
            src = "/main.bundle.js"
        }
        generalStyle()
    }
}