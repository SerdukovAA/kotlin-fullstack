package com.nixvision.support.terminal.render

import com.nixvision.support.terminal.render.lib.Routes.page
import com.nixvision.support.terminal.render.pages.IndexRender
import com.nixvision.support.terminal.render.pages.ProductRender



object RoutingConfiguration {

    init {

        page("/product/{id}") {
            val id = call["id"]
            ProductRender.pageForOneProduct(id)
        }

        page("/index") {
            IndexRender.indexPage()
        }

        page("/index/{path}/gut") {
            IndexRender.indexPage()
        }

    }
}