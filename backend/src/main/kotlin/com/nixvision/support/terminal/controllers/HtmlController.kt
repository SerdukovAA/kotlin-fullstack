package com.nixvision.support.terminal.controllers


import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HtmlController {

    @GetMapping("/")
    fun blog(): String {
        return "blog"
    }

}