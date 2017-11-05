package com.sath.development.coe.resources

import com.sath.development.coe.domain.OpenInfoStore
import com.sath.development.coe.service.DummyService
import org.springframework.web.bind.annotation.*


@RestController
class RestResource(val dummyService: DummyService) {

    @GetMapping("/invoke_hello_service")
    fun sayHelloToInvoker():String{
        return dummyService.sayHelloToTheInvoker();
    }

    @GetMapping("/open_info/{key}")
    fun getOpenOpenInfoStoreByID(@RequestParam(value = "key") key:String): OpenInfoStore {
        return dummyService.findSingleOpenInfoStoreData(key);
    }

    @PostMapping("/open_info")
    fun postOpenOpenInfoStore(@RequestBody openInfoStore:OpenInfoStore):OpenInfoStore{

        return dummyService.pushToOpenInfoStore(openInfoStore)

    }

    @PutMapping("/open_info")
    fun putOpenOpenInfoStore(@RequestBody openInfoStore:OpenInfoStore):OpenInfoStore{
        return dummyService.pushToOpenInfoStore(openInfoStore)
    }

    @GetMapping("/open_info")
    fun  listAllOpenInfoStore():List<OpenInfoStore>{
        return dummyService.listOpenInfoStoreData()
    }

    @DeleteMapping("/open_info/{key}")
    fun deleteOpenOpenInfoStoreByID(@RequestParam(value = "key") key:String): Boolean {
        return dummyService.deleteOpenInfoStoreData(key);
    }


}