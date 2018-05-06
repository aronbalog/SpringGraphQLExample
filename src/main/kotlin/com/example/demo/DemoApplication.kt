package com.example.demo

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Component

@SpringBootApplication
class DemoApplication

//fun main(args: Array<String>) {
//    runApplication<DemoApplication>(*args)
//}
fun main(args: Array<String>) {
    SpringApplication.run(DemoApplication::class.java, *args)
}

