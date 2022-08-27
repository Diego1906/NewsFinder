package com.example.newsfinder.data.repository

import com.example.newsfinder.data.mappers.toEntity
import com.example.newsfinder.data.remote.IRetrofitConfig
import com.example.newsfinder.domain.entities.ArticlesEntity
import com.example.newsfinder.domain.repository.IArticlesRepository
import javax.inject.Inject

class ArticlesRepository @Inject constructor(
    private val api: IRetrofitConfig
) : IArticlesRepository {

    override suspend fun getArticles(): ArticlesEntity {
        return api.getInstance().getArticles(
            description = "bmw",
            dateFrom = "2022-08-15"
        ).toEntity()
    }
}