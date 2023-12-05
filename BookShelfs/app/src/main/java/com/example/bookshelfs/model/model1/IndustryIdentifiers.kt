package com.example.bookshelfs.model.model1

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class IndustryIdentifiers (

  @SerialName("type"       ) var type       : String? = null,
  @SerialName("identifier" ) var identifier : String? = null

)