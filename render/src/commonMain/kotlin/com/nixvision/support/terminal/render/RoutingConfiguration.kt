package com.nixvision.support.terminal.render

import com.nixvision.support.terminal.render.lib.Routes.NOT_FOUND_URL
import com.nixvision.support.terminal.render.lib.Routes.page
import com.nixvision.support.terminal.render.pages.HelpPage
import com.nixvision.support.terminal.render.pages.IndexPage
import com.nixvision.support.terminal.render.pages.NotFoundRender
import com.nixvision.support.terminal.render.pages.ProductRender
import com.nixvision.support.terminal.render.pages.users.UserFormPage


object RoutingConfiguration {

    init {

        page("/product/{id}") {
            val id = call["id"]
            ProductRender.pageForOneProduct(id)
        }

        page("/index") {
            IndexPage.indexPage()
        }

/*        page("/") {
            IndexPage.indexPage()
        }*/

        page("/help") {
            HelpPage.helpPage()
        }

        page("/users") {
            UserFormPage.page()
        }


        page(NOT_FOUND_URL) {
            NotFoundRender.pageNotFound()
        }

    }
}