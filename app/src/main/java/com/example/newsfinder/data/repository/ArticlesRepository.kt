package com.example.newsfinder.data.repository

import com.example.newsfinder.data.mappers.toEntity
import com.example.newsfinder.data.remote.IRetrofitConfig
import com.example.newsfinder.domain.entities.ArticleEntity
import com.example.newsfinder.domain.repository.IArticlesRepository
import javax.inject.Inject

class ArticlesRepository @Inject constructor(
    private val api: IRetrofitConfig
) : IArticlesRepository {

    override suspend fun getArticles(): ArticleEntity {
        return api.getInstance().getArticles(
            description = "bmw",
            dateFrom = "2022-07-25"
        ).toEntity()
    }
}