package com.example.bookshelfs.model.model1

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SaleInfo (

  @SerialName("country"     ) var country     : String?  = null,
  @SerialName("saleability" ) var saleability : String?  = null,
  @SerialName("isEbook"     ) var isEbook     : Boolean? = null

)