package com.gabniel.domain.repository

import com.gabniel.domain.Resource
import com.gabniel.domain.model.AnimeModel
import kotlinx.coroutines.flow.Flow

interface AnimeRepository {
    fun getRecommendationAnime(): Flow<Resource<List<AnimeModel>>>
}