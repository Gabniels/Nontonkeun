package com.gabniel.data.remote.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DetailAnimeResponse(
    val data: AnimeDetailItem,
) : Parcelable

@Parcelize
data class AnimeDetailItem(
    val mal_id: Int?,
    val url: String?,
    val images: Images?,
    val trailer: Trailer?,
    val approved: Boolean?,
    val title: String?,
    val type: String?,
    val source: String?,
    val episodes: Int?,
    val status: String?,
    val airing: Boolean?,
    val aired: Aired?,
    val duration: String?,
    val rating: String?,
    val score: Double?,
    val rank: Int?,
    val popularity: Int?,
    val synopsis: String?,
    val season: String?,
    val year: Int?,
    val studios: List<StudiosItem>,
    val genres: List<GenresItem>,
    val theme: ThemeItem
) : Parcelable

@Parcelize
data class Trailer(
    val youtube_id: String?,
    val url: String?,
    val embed_url: String?,
    val images: ImagesYoutube?
) : Parcelable

@Parcelize
data class Aired(
    val from: String?,
    val to: String?,
    val string: String?
) : Parcelable

@Parcelize
data class StudiosItem(
    val mal_id: Int?,
    val type: String?,
    val name: String?,
    val url: String?
) : Parcelable

@Parcelize
data class GenresItem(
    val mal_id: Int?,
    val type: String?,
    val name: String?,
    val url: String?
) : Parcelable

@Parcelize
data class ThemeItem(
    val openings: List<String>,
    val endings: List<String>
) : Parcelable




