package com.example.newsfinder.domain.repository

import com.example.newsfinder.domain.entities.ArticleEntity

interface IArticlesRepository {

    suspend fun getArticles(): ArticleEntity
}