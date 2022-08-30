package com.example.newsfinder.data.remote

import com.example.newsfinder.BuildConfig
import com.example.newsfinder.data.response.ArticleResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface INewsApi {

    @GET("v2/everything")
    suspend fun getArticles(
        @Query("q") description: String = "Bitcoin",
        @Query("pageSize") pageSize: Int = 10,
        @Query("language") language: String = "pt",
        @Query("sortBy") sortBy: String = "relevancy",
        @Query("apiKey") apiKey: String = BuildConfig.API_KEY
    ): ArticleResponse
}