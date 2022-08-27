package com.example.newsfinder.presentation.viewmodel

import androidx.lifecycle.LiveData
import com.example.newsfinder.domain.entities.ArticlesEntity

interface IArticlesViewModel {

    fun getArticles(): LiveData<ArticlesEntity>
}