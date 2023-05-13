package com.gabniel.data.remote.service

import com.gabniel.data.remote.Response.AnimeResponse
import retrofit2.http.GET

interface AnimeService {

    @GET("recommendations/anime")
    suspend fun getRecommendationAnime(): AnimeResponse

}