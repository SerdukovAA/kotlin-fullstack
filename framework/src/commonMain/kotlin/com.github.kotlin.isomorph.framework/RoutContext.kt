package com.github.kotlin.isomorph.framework


class RoutContext(path: String) {

    init {

        println(path)
        //parse @path@


    }


    var context: Map<String, String> = mapOf()

    val call: Map<String, String>
        get() = context
}

