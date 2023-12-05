package com.example.bookshelfs.model.model1

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Epub (

  @SerialName("isAvailable"  ) var isAvailable  : Boolean? = null,
  @SerialName("acsTokenLink" ) var acsTokenLink : String?  = null

)