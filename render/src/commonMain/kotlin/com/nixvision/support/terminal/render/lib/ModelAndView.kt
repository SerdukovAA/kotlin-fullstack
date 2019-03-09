package com.nixvision.support.terminal.render.lib

data class ModelAndView(val html: String ="", val model: Any = Any())
fun ModelAndView.isFound(): Boolean = html.isNotBlank()