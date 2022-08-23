package com.example.newsfinder.data.response

data class ArticleResponse(
    val status: String? = null,
    val totalResults: Int,
    val articles: List<ArticleItemResponse>? = null
)

data class ArticleItemResponse(
    val source: ArticleSourceItemResponse? = null,
    val author: String? = null,
    val title: String? = null,
    val description: String? = null,
    val url: String? = null,
    val urlToImage: String? = null,
    val publishedAt: String? = null,
    val content: String? = null
)

data class ArticleSourceItemResponse(
    val id: String? = null,
    val name: String? = null
)