package com.nixvision.support.terminal.render.components

import kotlinx.html.*


fun HTML.mainLayoutWithTitleBar(content: DIV.() -> Unit) {
    body {
        style = "margin:0"
        mainContainer {
            //Header
            titleToolBar(title = "SupportTerminal")
            //Under header
            leftMenuWithContent {
                content()
            }
        }
    }
}


fun BODY.mainContainer(content: DIV.() -> Unit) {
    div {
        id = "mainContainer"
        style = " display: flex; flex-direction: column; height: 100%;"
        content()
    }
}


fun DIV.titleToolBar(title: String) {
    div {
        id = "titleToolBar"
        style = """ height: 50px; background-color: #999; border-bottom:1px solid #333 """
        +title
    }
}

fun DIV.leftMenuWithContent(content: DIV.() -> Unit) {

    div {
        id = "leftMenuWithContent"
        style = " display: flex; flex:auto; background-color: #DDD;"

        //MENU LEFT SIDE
        div {
            id = "leftSideMenu"
            style = " width: 80px; border-right:1px solid #333;display: flex; flex-direction: column;"
            a {
                style = "font-size:25px;"
                href = "/index"
                +"Index"
            }
            a {
                style = "font-size:25px;"
                href = "/help"
                +"Help"
            }
            a {
                style = "font-size:25px;"
                href = "/fuck"
                +"Fuck"
            }

        }

        //CONTENT RIGHT SIDE
        div {
            id = "rightSideContent"
            style = " flex: auto "

            content()

        }
    }
}
