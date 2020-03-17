package com.github.estore.render.lib

import com.github.estore.render.RoutingConfiguration

object Routes {

    const val NOT_FOUND_URL = "/404"
    val routes: MutableMap<String, (String) -> ModelAndView> = mutableMapOf()

    fun page(pathTemplate: String, contextFun: RoutContext.() -> ModelAndView) {
        //парсим pathTemplate и загоняем переменные в RoutContext
        routes[pathTemplate] = { path -> contextFun(RoutContext(path)) }
    }

}

fun RoutingConfiguration.page(pathTemplate: String, contextFun: RoutContext.() -> ModelAndView) {
    //parsing pathTemplate
    Routes.routes[pathTemplate] = { path -> contextFun(RoutContext(path)) }
}

val RoutingConfiguration.routes: MutableSet<String> get() = Routes.routes.keys