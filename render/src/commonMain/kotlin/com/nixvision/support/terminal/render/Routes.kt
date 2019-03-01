package com.nixvision.support.terminal.render

import com.nixvision.support.terminal.render.pages.IndexRender
import com.nixvision.support.terminal.render.pages.ProductRender

object Routes {

    val routes: MutableMap<String, (String) -> ModelAndView> = mutableMapOf()


    fun routing() {

        page("/product/{id}") {
                val id = call["id"]
              ProductRender.pageForOneProduct(id)
        }

        page("/index") {
            IndexRender.indexPage()
        }

    }

    fun page(pathTemplate: String, contextFun: RoutContext.(p: String) -> ModelAndView) {
        //парсим pathTemplate и загоняем переменные в RoutContext
        routes[pathTemplate] = { path ->  contextFun(RoutContext(path), "test")}
    }

}