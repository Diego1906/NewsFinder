package com.example.newsfinder.presentation.di

import com.example.newsfinder.domain.usecase.IArticlesUseCase
import com.example.newsfinder.presentation.viewmodel.ArticlesViewModel
import com.example.newsfinder.presentation.viewmodel.IArticlesViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
object PresentationModule {

    @Provides
    fun providesViewModel(useCase: IArticlesUseCase): IArticlesViewModel {
        return ArticlesViewModel(useCase)
    }
}