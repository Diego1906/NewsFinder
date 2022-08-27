package com.example.newsfinder.data.remote

import com.example.newsfinder.BuildConfig
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Inject

class RetrofitConfig @Inject constructor() : IRetrofitConfig {

    private val retrofit: Retrofit

    init {
        val moshi = Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()

        retrofit = Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL)
            .client(setupClient())
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
    }

    override fun getInstance(): INewsApi {
        return retrofit.create(INewsApi::class.java)
    }

    private fun setupClient(): OkHttpClient {
        HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY).also {
            return OkHttpClient.Builder()
                .addInterceptor(it)
                .build()
        }
    }
}