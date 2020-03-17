package com.github.estore.render.pages

import com.github.kotlin.isomorph.framework.ModelAndViewK


object ProductRender {

    fun pageForOneProduct(id: String?): ModelAndViewK {

        return ModelAndViewK(html = "<h4>Product ${id}</h4>", model = Any())
    }

}


