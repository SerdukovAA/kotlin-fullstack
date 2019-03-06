package com.nixvision.support.terminal.render.lib

object Routes {

    val routes: MutableMap<String, (String) -> ModelAndView> = mutableMapOf()

    fun page(pathTemplate: String, contextFun: RoutContext.() -> ModelAndView) {
        //парсим pathTemplate и загоняем переменные в RoutContext
        routes[pathTemplate] = { path ->  contextFun(RoutContext(path))}
    }

}
