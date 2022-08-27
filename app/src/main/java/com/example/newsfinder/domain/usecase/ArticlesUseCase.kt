package com.example.newsfinder.domain.usecase

import com.example.newsfinder.domain.entities.ArticlesEntity
import com.example.newsfinder.domain.repository.IArticlesRepository
import javax.inject.Inject

class ArticlesUseCase @Inject constructor(
    private val repository: IArticlesRepository
) : IArticlesUseCase {

    override suspend fun getArticles(): ArticlesEntity {
        return repository.getArticles()
    }
}