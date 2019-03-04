package com.nixvision.support.terminal.render.lib


object RoutesHandler {

     fun handle(path:String) : ModelAndView {

         var resultView: ModelAndView = pageNotFound()

         for ((pathTemplate, handler) in Routes.routes){

             if( pathEqualTemplate ( path , pathTemplate ) ) {
                 resultView = handler.invoke(path)
                 break
             }
         }

         return resultView
    }


    fun pathEqualTemplate(path:String , template: String): Boolean{

        val pathParts = path.split("/")
        val templateParts = path.split("/")


        val pathPartsReg = mutableListOf<String>()
        pathParts.forEach { p ->
            if(p.contains("{") && p.contains("}"))
                pathPartsReg.add("*")
            else
                pathPartsReg.add(p)
        }

        for( (i,t) in templateParts.withIndex() ){

            if(pathPartsReg.get())


        }


        return true
    }

}


