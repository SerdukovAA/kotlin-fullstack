package com.nixvision.support.terminal.render.lib


class RoutContext(path: String) {

    init {

        println(path)
        //parse @path@


    }


    var context: Map<String, String> = mapOf()

    val call: Map<String, String>
        get() = context
}

