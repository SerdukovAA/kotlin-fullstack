package com.github.estore.render

import com.github.estore.render.lib.Routes.NOT_FOUND_URL
import com.github.estore.render.lib.Routes.page
import com.github.estore.render.pages.HelpPage
import com.github.estore.render.pages.IndexPage
import com.github.estore.render.pages.NotFoundRender
import com.github.estore.render.pages.ProductRender
import com.github.estore.render.pages.users.UsersListPage


object RoutingConfiguration {

    init {

        page("/product/{id}") {
            val id = call["id"]
            ProductRender.pageForOneProduct(id)
        }

        page("/index") {
            IndexPage.indexPage()
        }

        page("/") {
            IndexPage.indexPage()
        }

        page("/help") {
            HelpPage.helpPage()
        }

        page("/users/list") {
            UsersListPage.page()
        }


        page(NOT_FOUND_URL) {
            NotFoundRender.pageNotFound()
        }

    }
}