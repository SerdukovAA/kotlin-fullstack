package com.nixvision.support.terminal.render.lib

class ModelAndView(val html: String = "", val model: Any = Any())





fun pageNotFound():ModelAndView = ModelAndView(html ="<404>")