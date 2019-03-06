package com.nixvision.support.terminal.render.pages

import com.nixvision.support.terminal.render.lib.ModelAndView

object NotFoundRender {

    fun pageNotFound(): ModelAndView {
        return ModelAndView(html = "<h4>404 !!</h4>", model = Any())
    }

}


