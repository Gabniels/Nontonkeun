package com.gabniel.nontonkeun.ui.anime

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.gabniel.domain.usecase.anime.AnimeUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AnimeViewModel @Inject constructor(
    animeUseCase: AnimeUseCase,
) : ViewModel() {
    val getRecommendationAnime = animeUseCase.getRecommendationAnime().asLiveData()
}