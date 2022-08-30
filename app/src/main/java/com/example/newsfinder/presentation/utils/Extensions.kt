package com.example.newsfinder.presentation.utils

import com.example.newsfinder.domain.entities.ArticlesEntity

fun ArticlesEntity.getId() = articles?.firstOrNull()?.source?.id

fun ArticlesEntity.getTitle() = articles?.firstOrNull()?.title

fun ArticlesEntity.getAuthor() = articles?.firstOrNull()?.author