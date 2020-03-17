package com.github.kotlin.isomorph.framework

const val NOT_FOUND_URL = "/404"

open class Routes {


    val routes: MutableMap<String, (String) -> ModelAndViewK> = mutableMapOf()

    fun page(pathTemplate: String, contextFun: RoutContext.() -> ModelAndViewK) {
        //parsing pathTemplate
        routes[pathTemplate] = { path -> contextFun(RoutContext(path)) }
    }
}



