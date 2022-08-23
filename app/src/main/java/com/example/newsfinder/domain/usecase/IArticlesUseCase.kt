package com.example.newsfinder.domain.usecase

import com.example.newsfinder.domain.entities.ArticleEntity

interface IArticlesUseCase {

   suspend fun getArticles(): ArticleEntity
}