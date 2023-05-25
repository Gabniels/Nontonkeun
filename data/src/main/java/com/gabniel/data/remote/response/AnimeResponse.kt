package com.gabniel.data.remote.response

import android.os.Parcelable
import com.gabniel.data.utils.replaceIfNull
import com.gabniel.domain.model.*
import kotlinx.parcelize.Parcelize

@Parcelize
data class AnimeResponse(
    val pagination: Pagination?,
    val data: List<AnimeItem>,
) : Parcelable

@Parcelize
data class Pagination(
    val has_next_page: Boolean?,
    val last_visible_page: Int?,
) : Parcelable

@Parcelize
data class AnimeItem(
    val mal_id: String?,
    val entry: List<EntryItem>,
    val content: String?,
    val date: String?,
    val user: User?,
) : Parcelable {
    companion object {
        fun transformDomain(input: AnimeResponse): List<AnimeModel> {
            val dataList = ArrayList<AnimeModel>()
            input.data.map {
                val item = AnimeModel(
                    mal_id = it.mal_id,
                    entry = getEntry(it.entry),
                    content = it.content.replaceIfNull(),
                    date = it.date.replaceIfNull(),
                    user = getUser(it.user))
                dataList.add(item)
            }
            return dataList
        }

        private fun getEntry(entry: List<EntryItem>): List<EntryItemModel> {
            val result: ArrayList<EntryItemModel> = arrayListOf()
            entry.forEach {
                val data = EntryItemModel(
                    mal_id = it.mal_id.replaceIfNull(),
                    url = it.url.replaceIfNull(),
                    images = getImages(it.images),
                    title = it.title)
                result.add(data)
            }
            return result
        }

        private fun getImages(image: Images?): ImagesModel {
            return ImagesModel(
                jpg = getJpg(image?.jpg),
                webp = getWebp(image?.webp)
            )
        }

        private fun getJpg(jpg: Jpg?): JpgModel {
            return JpgModel(
                image_url = jpg?.image_url,
                small_image_url = jpg?.small_image_url,
                large_image_url = jpg?.large_image_url
            )
        }

        private fun getWebp(webp: Webp?): WebpModel {
            return WebpModel(
                image_url = webp?.image_url,
                small_image_url = webp?.small_image_url,
                large_image_url = webp?.large_image_url
            )
        }

        private fun getUser(user: User?): UserModel {
            return UserModel(
                url = user?.url,
                username = user?.username
            )
        }
    }
}

@Parcelize
data class EntryItem(
    val mal_id: Int?,
    val url: String?,
    val images: Images?,
    val title: String?,
) : Parcelable

@Parcelize
data class User(
    val url: String?,
    val username: String?,
) : Parcelable








