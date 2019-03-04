package com.nixvision.support.terminal.config

import com.nixvision.support.terminal.render.RoutingConfiguration
import com.nixvision.support.terminal.render.lib.RoutesHandler
import com.nixvision.support.terminal.render.lib.routes
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.ModelAndView
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping
import org.springframework.web.servlet.mvc.AbstractController
import java.util.*
import java.util.function.Consumer
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse


@Configuration
class DynamicPagesController {
    @Bean
    fun dynamicPagesMapping(): SimpleUrlHandlerMapping {
        val mapping = SimpleUrlHandlerMapping()
        mapping.order = Integer.MAX_VALUE - 2

        val urlMap = HashMap<String, AbstractController>()

        RoutingConfiguration.routes.forEach(Consumer { path ->
            urlMap[path] = object : AbstractController() {
                override fun handleRequestInternal(request: HttpServletRequest, response: HttpServletResponse): ModelAndView? {
                    val mv = RoutesHandler.handle(request.getRequestPath())
                    response.writer.println(mv.html)
                    return null
                }
            }
        })

        mapping.urlMap = urlMap
        return mapping
    }
}

fun HttpServletRequest.getRequestPath(): String {
    val requestURL = StringBuilder(this.requestURI.toString())
    val queryString = this.queryString
    return if (queryString == null) {
        requestURL.toString()
    } else {
        requestURL.append('?').append(queryString).toString()
    }
}
