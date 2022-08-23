package com.example.newsfinder.data.remote

import com.example.newsfinder.BuildConfig
import com.example.newsfinder.data.response.ArticleResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface INewsApi {

    @GET("everything")
    suspend fun getArticles(
        @Query("q") description: String,
        @Query("from") from: String,
        @Query("sortBy") sortBy: String = "publishedAt",
        @Query("apiKey") apiKey: String = BuildConfig.API_KEY
    ): ArticleResponse
}