package com.nixvision.support.terminal.render


class RoutesHandler() {


    fun handle(path:String) : ModelAndView? {
        var template = path
        //TODO ищет первое совпадение и вызывает функицю
        val pathHandler = Routes.routes[template]
        return pathHandler?.invoke(path)
    }

}


