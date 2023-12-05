package com.example.bookshelfs.model.model1

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ReadingModes (

  @SerialName("text"  ) var text  : Boolean? = null,
  @SerialName("image" ) var image : Boolean? = null

)