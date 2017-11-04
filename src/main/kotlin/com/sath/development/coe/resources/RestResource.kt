package com.sath.development.coe.resources

import com.sath.development.coe.service.DummyService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class RestResource(val dummyService: DummyService) {

    @GetMapping("/invoke_hello_service")
    fun sayHelloToInvoker():String{
        return dummyService.sayHelloToTheInvoker();
    }


}