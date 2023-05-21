package com.gabniel.domain.usecase.anime

import com.gabniel.domain.Resource
import com.gabniel.domain.model.AnimeModel
import com.gabniel.domain.repository.AnimeRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AnimeUseCaseImpl @Inject constructor(
    private val repository: AnimeRepository,
) : AnimeUseCase {
    override fun getRecommendationAnime(): Flow<Resource<List<AnimeModel>>> {
        return repository.getRecommendationAnime()
    }

}