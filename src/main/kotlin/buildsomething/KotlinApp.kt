package com.buildsomething

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@SpringBootApplication
class KotlinApp

fun main(args: Array<String>){
    SpringApplication.run(KotlinApp::class.java, *args)
}

@RestController
@RequestMapping("/")
class HelloController {
    @GetMapping()
    fun hello(): ResponseEntity<String> {
        return ResponseEntity.ok("Hello World")
    }

    @GetMapping(path = ["/{name}"])
    fun helloWorldParam(@PathVariable name: String) : ResponseEntity<String> {
        return ResponseEntity.ok("Hello $name")
    }


}