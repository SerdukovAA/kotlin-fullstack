package com.nixvision.support.terminal.render.lib

import com.nixvision.support.terminal.render.RoutingConfiguration


object RoutesHandler {

    val PATH_VARIABLE_PLACE_HOLDER = Regex("\\{[\\s\\S]+\\}")

    init {
        RoutingConfiguration
    }

    fun handle(path: String): ModelAndView {
        var resultView = ModelAndView()
        for ((pathTemplate, handler) in Routes.routes) {
            if (isPathMatchTemplate(path, pathTemplate)) {
                resultView = handler.invoke(path)
                break
            }
        }
        return resultView
    }


    fun isPathMatchTemplate(path: String, template: String): Boolean {
        val pathParts = path.split("?")[0].split("/")
        val templateParts = template.split("?")[0].split("/")
        if (templateParts.size != pathParts.size) {
            return false
        }
        val pathsPairs = templateParts zip pathParts
        for ((t, p) in pathsPairs) {
            if (t != p && !PATH_VARIABLE_PLACE_HOLDER.matches(t)) {
                return false
            }
        }
        return true
    }

}


