package com.gabniel.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class AnimeModel(
    val mal_id: String?,
    val entry: List<EntryItemModel>,
    val content: String?,
    val date: String?,
    val user: UserModel?,
) : Parcelable

@Parcelize
data class EntryItemModel(
    val mal_id: Int?,
    val url: String?,
    val images: ImagesModel?,
    val title: String?,
) : Parcelable

@Parcelize
data class ImagesModel(
    val jpg: JpgModel?,
    val webp: WebpModel?,
) : Parcelable

@Parcelize
data class JpgModel(
    val image_url: String?,
    val small_image_url: String?,
    val large_image_url: String?,
) : Parcelable

@Parcelize
data class WebpModel(
    val image_url: String?,
    val small_image_url: String?,
    val large_image_url: String?,
) : Parcelable

@Parcelize
data class UserModel(
    val url: String?,
    val username: String?,
) : Parcelable
