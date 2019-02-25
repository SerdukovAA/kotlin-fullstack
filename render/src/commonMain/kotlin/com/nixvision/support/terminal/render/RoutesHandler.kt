package com.nixvision.support.terminal.render


class RoutesHandler


fun handle(path: String){

    get("/product/{productId}"){

       val o:Any = it.get(0)




    }

}



fun get(path: String, handler: (cont: List<Any>)-> ModelAndView){

    val pathVar: List<Any> = ArrayList()

    handler.invoke(pathVar)

}


