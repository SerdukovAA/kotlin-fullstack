package com.nixvision.support.terminal.render.lib

import com.nixvision.support.terminal.render.RoutingConfiguration

object Routes {

    val routes: MutableMap<String, (String) -> ModelAndView> = mutableMapOf()

    fun page(pathTemplate: String, contextFun: RoutContext.(p: String) -> ModelAndView) {
        //парсим pathTemplate и загоняем переменные в RoutContext
        routes[pathTemplate] = { path ->  contextFun(RoutContext(path), "test")}
    }

}

fun RoutingConfiguration.page(pathTemplate: String, contextFun: RoutContext.() -> ModelAndView) {
    //parsing pathTemplate
    Routes.routes[pathTemplate] = { path ->  contextFun(RoutContext(path))}
}

val RoutingConfiguration.routes: MutableSet<String>  get() = Routes.routes.keys