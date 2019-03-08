package com.nixvision.support.terminal.render

import com.nixvision.support.terminal.render.lib.Routes.page
import com.nixvision.support.terminal.render.pages.HelpPage
import com.nixvision.support.terminal.render.pages.IndexPage
import com.nixvision.support.terminal.render.pages.NotFoundRender
import com.nixvision.support.terminal.render.pages.ProductRender


object RoutingConfiguration {

    init {

        page("/product/{id}") {
            val id = call["id"]
            ProductRender.pageForOneProduct(id)
        }

        page("/index") {
            IndexPage.indexPage()
        }

        page("/help") {
            HelpPage.helpPage()
        }

        page("/index/{path}/gut") {
            IndexPage.indexPage()
        }

        page("/404") {
            NotFoundRender.pageNotFound()
        }

    }
}