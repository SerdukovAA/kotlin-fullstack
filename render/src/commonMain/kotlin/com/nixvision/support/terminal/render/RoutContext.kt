package com.nixvision.support.terminal.render




class RoutContext(path : String) {

   var context: Map<String, String> = mapOf()
}

val RoutContext.call: Map<String, String> get() = context