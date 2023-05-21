package com.gabniel.data.remote.service

import com.gabniel.data.remote.response.AnimeResponse
import retrofit2.http.GET

interface AnimeService {

    @GET("recommendations/anime")
    suspend fun getRecommendationAnime(): AnimeResponse

}