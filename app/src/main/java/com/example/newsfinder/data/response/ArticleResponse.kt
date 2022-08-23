package com.example.newsfinder.data.response

import com.squareup.moshi.Json

data class ArticleResponse(
    @Json(name = "status") val status: String? = null,
    @Json(name = "totalResults") val totalResults: Int,
    @Json(name = "articles") val articles: List<ArticleItemResponse>? = null
)

data class ArticleItemResponse(
    @Json(name = "source") val source: ArticleSourceItemResponse? = null,
    @Json(name = "author") val author: String? = null,
    @Json(name = "title") val title: String? = null,
    @Json(name = "description") val description: String? = null,
    @Json(name = "url") val url: String? = null,
    @Json(name = "urlToImage") val urlToImage: String? = null,
    @Json(name = "publishedAt") val publishedAt: String? = null,
    @Json(name = "content") val content: String? = null
)

data class ArticleSourceItemResponse(
    @Json(name = "id") val id: String? = null,
    @Json(name = "name") val name: String? = null
)