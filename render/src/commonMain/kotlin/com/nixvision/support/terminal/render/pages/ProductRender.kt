package com.nixvision.support.terminal.render.pages

import com.nixvision.support.terminal.render.lib.ModelAndView

object ProductRender {

    fun pageForOneProduct(id: String?): ModelAndView {

        return ModelAndView(html = "<h4>Product ${id}</h4>", model = Any())
    }

}


