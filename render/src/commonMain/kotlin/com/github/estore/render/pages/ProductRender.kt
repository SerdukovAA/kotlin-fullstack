package com.github.estore.render.pages

import com.github.estore.render.lib.ModelAndView


object ProductRender {

    fun pageForOneProduct(id: String?): ModelAndView {

        return ModelAndView(html = "<h4>Product ${id}</h4>", model = Any())
    }

}


