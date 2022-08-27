package com.example.newsfinder.domain.repository

import com.example.newsfinder.domain.entities.ArticlesEntity

interface IArticlesRepository {

    suspend fun getArticles(): ArticlesEntity
}