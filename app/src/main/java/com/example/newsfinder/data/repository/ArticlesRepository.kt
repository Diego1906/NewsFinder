package com.example.newsfinder.data.repository

import com.example.newsfinder.data.mappers.toEntity
import com.example.newsfinder.data.remote.INewsApi
import com.example.newsfinder.domain.entities.ArticleEntity
import com.example.newsfinder.domain.repository.IArticlesRepository

class ArticlesRepository(private val api: INewsApi) : IArticlesRepository {

    override suspend fun getArticles(): ArticleEntity {
        return api.getArticles(description = "", dateFrom = "").toEntity()
    }
}