package com.example.newsfinder.domain.entities

data class ArticlesEntity(
    val status: String? = null,
    val totalResults: Int = 0,
    val articles: List<ArticleItemEntity>? = null
)

data class ArticleItemEntity(
    val source: ArticleSourceItemEntity? = null,
    val author: String? = null,
    val title: String? = null,
    val description: String? = null,
    val url: String? = null,
    val urlToImage: String? = null,
    val publishedAt: String? = null,
    val content: String? = null
)

data class ArticleSourceItemEntity(
    val id: String? = null,
    val name: String? = null
)