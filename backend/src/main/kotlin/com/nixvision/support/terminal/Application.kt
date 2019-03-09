package com.nixvision.support.terminal

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@SpringBootApplication
class Application {
    @GetMapping("/fuck")
    fun getFuck(): String {
        return "Not FOUND"
    }

}

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}



