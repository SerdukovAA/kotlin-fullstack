package com.github.estore.render.lib

import com.github.estore.render.PagesRoutingConfiguration
import com.github.kotlin.isomorph.framework.ModelAndViewK


object RoutesHandler {

    private val PATH_VARIABLE_PLACE_HOLDER = Regex("\\{[\\s\\S]+\\}")

    init {
        PagesRoutingConfiguration
    }

    fun handle(path: String): ModelAndViewK? {
        var resultViewK: ModelAndViewK? = null
        for ((pathTemplate, handler) in PagesRoutingConfiguration.routes) {
            if (isPathMatchTemplate(path, pathTemplate)) {
                resultViewK = handler.invoke(path)
                break
            }
        }
        return resultViewK
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


