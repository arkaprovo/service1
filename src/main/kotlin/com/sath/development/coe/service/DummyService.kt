package com.sath.development.coe.service

import org.springframework.stereotype.Service
import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

@Service
class DummyService {

    val log:Log? = LogFactory.getLog(this.javaClass);

    fun sayHelloToTheInvoker():String{
        return "Hello from dummy Service"
    }

}