package com.sath.development.coe

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class Service1Application

fun main(args: Array<String>) {
    SpringApplication.run(Service1Application::class.java, *args)
}
