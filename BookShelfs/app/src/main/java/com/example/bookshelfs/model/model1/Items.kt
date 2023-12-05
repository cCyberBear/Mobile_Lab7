package com.example.bookshelfs.model.model1

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Items (

  @SerialName("kind"       ) var kind       : String?     = null,
  @SerialName("id"         ) var id         : String?     = null,
  @SerialName("etag"       ) var etag       : String?     = null,
  @SerialName("selfLink"   ) var selfLink   : String?     = null,
  @SerialName("volumeInfo" ) var volumeInfo : VolumeInfo? = VolumeInfo(),
  @SerialName("saleInfo"   ) var saleInfo   : SaleInfo?   = SaleInfo(),
  @SerialName("accessInfo" ) var accessInfo : AccessInfo? = AccessInfo(),
  @SerialName("searchInfo" ) var searchInfo : SearchInfo? = SearchInfo()

)