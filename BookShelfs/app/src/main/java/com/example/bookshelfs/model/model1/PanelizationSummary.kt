package com.example.bookshelfs.model.model1

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PanelizationSummary (

  @SerialName("containsEpubBubbles"  ) var containsEpubBubbles  : Boolean? = null,
  @SerialName("containsImageBubbles" ) var containsImageBubbles : Boolean? = null

)