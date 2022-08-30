package com.example.newsfinder.presentation.view

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.newsfinder.R
import com.example.newsfinder.presentation.viewmodel.IArticlesViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: IArticlesViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {
        viewModel.getArticles().observe(this) { articles ->
            articles?.let { results ->
                findViewById<TextView>(R.id.txtTeste).text =
                    results.articles?.firstOrNull { it.title != null }?.title
            }
        }
    }
}