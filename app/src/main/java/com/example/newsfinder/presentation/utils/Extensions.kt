package com.example.newsfinder.presentation.utils

import com.example.newsfinder.domain.entities.ArticlesEntity

fun ArticlesEntity.getId() = articles?.firstOrNull()?.source?.id