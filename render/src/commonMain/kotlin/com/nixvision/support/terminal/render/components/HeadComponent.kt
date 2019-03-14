package com.nixvision.support.terminal.render.components

import kotlinx.html.HTML
import kotlinx.html.head
import kotlinx.html.meta
import kotlinx.html.script


fun HTML.mainHead() {
    head {
        meta {
            charset = "utf-8"
        }
        script {
            src = "/main.bundle.js"
        }
        generalStyle()
    }
}