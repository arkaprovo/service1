package com.sath.development.coe.repo

import com.sath.development.coe.domain.OpenInfoStore
import org.springframework.data.repository.CrudRepository

interface OpenInfoStoreRepository: CrudRepository<OpenInfoStore, String> {
    fun findByKey(key: String):OpenInfoStore;
}