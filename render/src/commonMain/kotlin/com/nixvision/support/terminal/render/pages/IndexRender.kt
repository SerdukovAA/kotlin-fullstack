package com.nixvision.support.terminal.render.pages

import com.nixvision.support.terminal.render.lib.ModelAndView

object IndexRender {

    fun indexPage(): ModelAndView {
        return ModelAndView(html = "<h4>Index!!</h4>", model = Any())
    }

}


