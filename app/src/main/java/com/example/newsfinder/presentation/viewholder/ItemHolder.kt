package com.example.newsfinder.presentation.viewholder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.newsfinder.R
import com.example.newsfinder.domain.entities.ArticlesEntity

class ItemHolder private constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(article: ArticlesEntity) {
        TODO("Not implemented")
    }

    companion object {

        fun from(parent: ViewGroup): ItemHolder {
            return LayoutInflater
                .from(parent.context)
                .inflate(R.layout.item_list_news, parent, false)
                .run { ItemHolder(this) }
        }
    }
}