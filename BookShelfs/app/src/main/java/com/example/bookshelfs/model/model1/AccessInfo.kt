package com.example.bookshelfs.model.model1

import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AccessInfo (
  @SerialName("country"                ) var country                : String?  = null,
  @SerialName("viewability"            ) var viewability            : String?  = null,
  @SerialName("embeddable"             ) var embeddable             : Boolean? = null,
  @SerialName("publicDomain"           ) var publicDomain           : Boolean? = null,
  @SerialName("textToSpeechPermission" ) var textToSpeechPermission : String?  = null,
  @Contextual
  @SerialName("epub"                   ) var epub                   : Epub?    = Epub(),
  @Contextual
  @SerialName("pdf"                    ) var pdf                    : Pdf?     = Pdf(),
  @SerialName("webReaderLink"          ) var webReaderLink          : String?  = null,
  @SerialName("accessViewStatus"       ) var accessViewStatus       : String?  = null,
  @SerialName("quoteSharingAllowed"    ) var quoteSharingAllowed    : Boolean? = null

)