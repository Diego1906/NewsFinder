package com.example.newsfinder.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application() {

    override fun onCreate() {
        super.onCreate()
    }

    companion object {
        private lateinit var INSTANCE: App

        fun getInstance(): App {
            if (!::INSTANCE.isInitialized) {
                INSTANCE = App()
            }
            return INSTANCE
        }
    }
}