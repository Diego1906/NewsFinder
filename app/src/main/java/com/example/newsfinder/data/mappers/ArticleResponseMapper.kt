package com.example.newsfinder.data.mappers

import com.example.newsfinder.data.response.ArticleItemResponse
import com.example.newsfinder.data.response.ArticleResponse
import com.example.newsfinder.data.response.ArticleSourceItemResponse
import com.example.newsfinder.domain.entities.ArticleEntity
import com.example.newsfinder.domain.entities.ArticleItemEntity
import com.example.newsfinder.domain.entities.ArticleSourceItemEntity

fun ArticleResponse.toEntity() = ArticleEntity(
    status = status,
    totalResults = totalResults,
    articles = articles?.map {
        it.toEntity()
    }
)

fun ArticleItemResponse.toEntity() = ArticleItemEntity(
    source = source?.toEntity(),
    author = author,
    title = title,
    description = description,
    url = url,
    urlToImage = urlToImage,
    publishedAt = publishedAt,
    content = content
)

fun ArticleSourceItemResponse.toEntity() = ArticleSourceItemEntity(
    id = id,
    name = name
)