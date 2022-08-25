package com.example.newsfinder.domain.di

import com.example.newsfinder.domain.repository.IArticlesRepository
import com.example.newsfinder.domain.usecase.ArticlesUseCase
import com.example.newsfinder.domain.usecase.IArticlesUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent

// TODO: Testar com as duas classes abaixo
@Module
// @InstallIn(SingletonComponent::class)
@InstallIn(ActivityComponent::class)
class DomainModule {

    @Provides
    fun provideUseCase(repository: IArticlesRepository): IArticlesUseCase {
        return ArticlesUseCase(repository)
    }
}