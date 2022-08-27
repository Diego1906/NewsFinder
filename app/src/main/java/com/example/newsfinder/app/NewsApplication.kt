package com.example.newsfinder.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class NewsApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
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