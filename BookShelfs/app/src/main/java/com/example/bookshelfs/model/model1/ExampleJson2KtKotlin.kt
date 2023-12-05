package com.example.bookshelfs.model.model1

import com.example.bookshelfs.model.model1.Items
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ExampleJson2KtKotlin (

  @SerialName("kind"       ) var kind       : String?          = null,
  @SerialName("totalItems" ) var totalItems : Int?             = null,
  @SerialName("items"      ) var items      : ArrayList<Items> = arrayListOf()

)