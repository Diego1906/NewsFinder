package com.example.newsfinder.data.di

import com.example.newsfinder.data.remote.INewsApi
import com.example.newsfinder.data.remote.ServiceConfig
import com.example.newsfinder.data.repository.ArticlesRepository
import com.example.newsfinder.domain.repository.IArticlesRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@InstallIn(ActivityComponent::class)
@Module
object DataModule {

    @Provides
    fun provideService(): INewsApi = ServiceConfig().getInstance()

    @Provides
    fun provideRepository(api: INewsApi): IArticlesRepository = ArticlesRepository(api)
}