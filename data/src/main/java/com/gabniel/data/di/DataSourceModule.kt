package com.gabniel.data.di

import com.gabniel.data.remote.service.AnimeService
import com.gabniel.data.remote.source.anime.AnimeRemoteDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataSourceModule {

    /*  Anime   */
    @Provides
    @Singleton
    fun provideAnimeRemoteDataSource(
        animeService: AnimeService,
    ): AnimeRemoteDataSource {
        return AnimeRemoteDataSource(animeService)
    }

}