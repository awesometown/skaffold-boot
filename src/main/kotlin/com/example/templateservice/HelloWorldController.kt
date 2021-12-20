package com.example.templateservice

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello_world")
class HelloWorldController {

    @Suppress("FunctionOnlyReturningConstant")
    @GetMapping
    fun helloWorld(): String {
        return "Hello World211111"
    }
}
