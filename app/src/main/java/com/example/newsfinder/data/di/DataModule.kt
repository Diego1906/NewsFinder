package com.example.newsfinder.data.di

import com.example.newsfinder.data.remote.IRetrofitConfig
import com.example.newsfinder.data.remote.RetrofitConfig
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
    fun provideRetrofit(): IRetrofitConfig = RetrofitConfig()

    @Provides
    fun provideRepository(api: IRetrofitConfig): IArticlesRepository = ArticlesRepository(api)
}