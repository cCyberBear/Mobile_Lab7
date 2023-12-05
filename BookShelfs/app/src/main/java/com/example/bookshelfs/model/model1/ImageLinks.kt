package com.example.bookshelfs.model.model1


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ImageLinks (

  @SerialName("smallThumbnail" ) var smallThumbnail : String? = null,
  @SerialName("thumbnail"      ) var thumbnail      : String? = null

)