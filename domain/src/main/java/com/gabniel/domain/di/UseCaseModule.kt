package com.gabniel.domain.di

import com.gabniel.domain.repository.AnimeRepository
import com.gabniel.domain.usecase.anime.AnimeUseCase
import com.gabniel.domain.usecase.anime.AnimeUseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {

    @Provides
    @Singleton
    fun provideAnimeUseCase(
        animeRepository: AnimeRepository,
    ): AnimeUseCase {
        return AnimeUseCaseImpl(animeRepository)
    }

}