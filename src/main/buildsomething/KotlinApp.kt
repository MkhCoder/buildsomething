package main.kotlin.com.buildsomething

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication


@SpringBootApplication
open class KotlinApp

fun main(args: Array<String>){
    SpringApplication.run(KotlinApp::class.java, *args)
}