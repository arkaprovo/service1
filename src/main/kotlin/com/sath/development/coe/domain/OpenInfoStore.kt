package com.sath.development.coe.domain

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class OpenInfoStore(@Id val key:String,val information: String,val optionalInfo:String) {
}