package com.example.newsfinder.presentation.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.newsfinder.domain.entities.ArticlesEntity
import com.example.newsfinder.presentation.utils.getAuthor
import com.example.newsfinder.presentation.viewholder.ItemHolder
import com.example.newsfinder.presentation.utils.getId
import com.example.newsfinder.presentation.utils.getTitle

class NewsAdapter(private val action: (ArticlesEntity) -> Unit) :
    ListAdapter<ArticlesEntity, ItemHolder>(DiffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val article = getItem(position)
        holder.run {
            itemView.setOnClickListener { action.invoke(article) }
            bind(article)
        }
    }

    object DiffCallback : DiffUtil.ItemCallback<ArticlesEntity>() {
        override fun areItemsTheSame(oldItem: ArticlesEntity, newItem: ArticlesEntity): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: ArticlesEntity, newItem: ArticlesEntity): Boolean {
            return oldItem.getId() == newItem.getId()
                    && oldItem.getTitle() == newItem.getTitle()
                    && oldItem.getAuthor() == newItem.getAuthor()
        }
    }
}