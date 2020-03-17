package com.github.estore.config

import com.github.estore.render.PagesRoutingConfiguration
import com.github.estore.render.lib.RoutesHandler
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
class DynamicControllersConfiguration {
    @Bean
    fun dynamicPagesMapping(): SimpleUrlHandlerMapping {
        val mapping = SimpleUrlHandlerMapping()
        mapping.order = Integer.MAX_VALUE - 2
        val urlMap = HashMap<String, AbstractController>()
        PagesRoutingConfiguration.routes.keys.forEach(Consumer<String> { path ->
            urlMap[path] = object : AbstractController() {
                override fun handleRequestInternal(request: HttpServletRequest, response: HttpServletResponse): ModelAndView? {
                    val mv = RoutesHandler.handle(request.getRequestPath())
                    response.characterEncoding = "UTF-8"
                    response.writer.write(mv?.html)
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
