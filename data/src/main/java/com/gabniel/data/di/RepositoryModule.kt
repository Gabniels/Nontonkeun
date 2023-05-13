package com.gabniel.data.di

import com.gabniel.data.remote.source.anime.AnimeRemoteDataSource
import com.gabniel.data.remote.source.anime.AnimeRepositoryImpl
import com.gabniel.domain.Repository.AnimeRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    @Singleton
    fun provideAnimeRepository(
        animeRemoteDataSource: AnimeRemoteDataSource,
    ): AnimeRepository {
        return AnimeRepositoryImpl(
            remoteDataSource = animeRemoteDataSource
        )
    }

}