package com.gabniel.data.remote.source.anime

import com.gabniel.data.remote.response.AnimeResponse
import com.gabniel.data.remote.network.ApiResponse
import com.gabniel.data.remote.service.AnimeService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class AnimeRemoteDataSource @Inject constructor(
    private val animeService: AnimeService,
) {

    fun getRecommendationAnime(): Flow<ApiResponse<AnimeResponse>> {
        return flow {
            try {
                val response = animeService.getRecommendationAnime()
                val data = response.data
                if (data.isNotEmpty()) emit(ApiResponse.Success(response))
                else emit(ApiResponse.Empty)
            } catch (e: Exception) {
                emit(ApiResponse.Error(e.toString()))
            }
        }.flowOn(Dispatchers.IO)
    }
}