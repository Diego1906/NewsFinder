package com.example.newsfinder.domain.di

import com.example.newsfinder.domain.repository.IArticlesRepository
import com.example.newsfinder.domain.usecase.ArticlesUseCase
import com.example.newsfinder.domain.usecase.IArticlesUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@InstallIn(ActivityComponent::class)
@Module
object DomainModule {

    @Provides
    fun provideUseCase(repository: IArticlesRepository): IArticlesUseCase {
        return ArticlesUseCase(repository)
    }
}