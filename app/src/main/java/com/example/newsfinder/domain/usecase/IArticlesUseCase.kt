package com.example.newsfinder.domain.usecase

import com.example.newsfinder.domain.entities.ArticlesEntity

interface IArticlesUseCase {

   suspend fun getArticles(): ArticlesEntity
}