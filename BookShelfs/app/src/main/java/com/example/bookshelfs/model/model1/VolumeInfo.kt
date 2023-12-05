package com.example.bookshelfs.model.model1

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class VolumeInfo(

  @SerialName("title"               ) var title: String?                        = null,
  @SerialName("authors"             ) var authors: ArrayList<String> = arrayListOf(),
  @SerialName("publisher"           ) var publisher: String?                        = null,
  @SerialName("publishedDate"       ) var publishedDate: String?                        = null,
  @SerialName("description"         ) var description: String?                        = null,
  @SerialName("industryIdentifiers" ) var industryIdentifiers: ArrayList<IndustryIdentifiers> = arrayListOf(),
  @SerialName("readingModes"        ) var readingModes: ReadingModes?                  = ReadingModes(),
  @SerialName("pageCount"           ) var pageCount: Int?                           = null,
  @SerialName("printType"           ) var printType: String?                        = null,
  @SerialName("categories"          ) var categories: ArrayList<String>              = arrayListOf(),
  @SerialName("maturityRating"      ) var maturityRating: String?                        = null,
  @SerialName("allowAnonLogging"    ) var allowAnonLogging: Boolean?                       = null,
  @SerialName("contentVersion"      ) var contentVersion: String?                        = null,
  @SerialName("panelizationSummary" ) var panelizationSummary: PanelizationSummary?           = PanelizationSummary(),
  @SerialName("imageLinks"          ) var imageLinks: ImageLinks?                    = ImageLinks(),
  @SerialName("language"            ) var language: String?                        = null,
  @SerialName("previewLink"         ) var previewLink: String?                        = null,
  @SerialName("infoLink"            ) var infoLink: String?                        = null,
  @SerialName("canonicalVolumeLink" ) var canonicalVolumeLink: String?                        = null

)