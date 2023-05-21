package com.gabniel.data.remote.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Images(
    val jpg: Jpg?,
    val webp: Webp?,
) : Parcelable

@Parcelize
data class Jpg(
    val image_url: String?,
    val small_image_url: String?,
    val large_image_url: String?,
) : Parcelable

@Parcelize
data class Webp(
    val image_url: String?,
    val small_image_url: String?,
    val large_image_url: String?,
) : Parcelable

@Parcelize
data class ImagesYoutube(
    val image_url: String?,
    val small_image_url: String?,
    val medium_image_url: String?,
    val large_image_url: String?,
) : Parcelable
