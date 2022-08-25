package com.example.newsfinder.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class NewsApplication : Application() {

    override fun onCreate() {
        super.onCreate()
    }

    companion object {
        private lateinit var INSTANCE: NewsApplication

        fun getInstance(): NewsApplication {
            if (!::INSTANCE.isInitialized) {
                INSTANCE = NewsApplication()
            }
            return INSTANCE
        }
    }
}