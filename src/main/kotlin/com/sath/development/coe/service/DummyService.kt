package com.sath.development.coe.service

import com.sath.development.coe.domain.OpenInfoStore
import com.sath.development.coe.repo.OpenInfoStoreRepository
import org.springframework.stereotype.Service
import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

@Service
class DummyService(val openInfoRepository:OpenInfoStoreRepository) {

    val log:Log? = LogFactory.getLog(this.javaClass);

    fun sayHelloToTheInvoker():String{
        return "Hello from dummy Service"
    }

    fun pushToOpenInfoStore(data: OpenInfoStore):OpenInfoStore{
        openInfoRepository.save(data)
        return data;
    }

    fun listOpenInfoStoreData():List<OpenInfoStore>{
        return openInfoRepository.findAll().toList();
    }

    fun findSingleOpenInfoStoreData(key:String):OpenInfoStore{
        return openInfoRepository.findByKey(key);
    }

    fun deleteOpenInfoStoreData(key:String):Boolean{
        openInfoRepository.delete(key);
        return true
    }


}