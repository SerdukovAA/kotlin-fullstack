package com.nixvision.support.terminal.render.components

import kotlinx.html.*


fun HTML.mainLayoutWithTitleBar(content: DIV.() -> Unit) {
    body { style = "margin:0"
        mainContainer {
            titleToolBar("SupportTerminal")
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


fun DIV.titleToolBar(title:String) {
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

        //LEFT SIDE MENU
        div {
            id = "leftSideMenu"
            style = " width: 60px; border-right:1px solid #333"
            +"left side menu"
        }

        //CONTENT FOR RIGHT
        div {
            id = "leftMenuContent"
            style = " flex: auto "

            content()

        }
    }
}
