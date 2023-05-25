package com.gabniel.domain.usecase.anime

import com.gabniel.domain.Resource
import com.gabniel.domain.model.AnimeModel
import kotlinx.coroutines.flow.Flow

interface AnimeUseCase {
    fun getRecommendationAnime(): Flow<Resource<List<AnimeModel>>>
}