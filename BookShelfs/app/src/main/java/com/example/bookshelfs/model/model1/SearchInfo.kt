package com.example.bookshelfs.model.model1

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SearchInfo (

  @SerialName("textSnippet" ) var textSnippet : String? = null

)