package com.gabniel.data.di

import com.gabniel.data.remote.service.AnimeService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ServiceModule {

    @Provides
    @Singleton
    fun provideAnimeService(retrofit: Retrofit): AnimeService =
        retrofit.create(AnimeService::class.java)

}