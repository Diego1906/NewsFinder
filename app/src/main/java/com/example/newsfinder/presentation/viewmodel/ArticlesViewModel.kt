package com.example.newsfinder.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newsfinder.domain.entities.ArticleEntity
import com.example.newsfinder.domain.usecase.IArticlesUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch
import javax.inject.Inject

// @HiltViewModel
class ArticlesViewModel @Inject constructor(
    private val useCase: IArticlesUseCase
) : IArticlesViewModel,
    ViewModel() {

    private val articles: MutableLiveData<ArticleEntity> by lazy {
        MutableLiveData<ArticleEntity>().also {
            loadArticles()
        }
    }

    private fun loadArticles() {
        viewModelScope.launch(Dispatchers.IO) {
            useCase.getArticles()
        }
    }

    override fun getArticles(): LiveData<ArticleEntity> {
        return articles
    }

    override fun onCleared() {
        super.onCleared()
        viewModelScope.cancel()
    }
}