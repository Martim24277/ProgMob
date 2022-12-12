package com.example.newskotlinapp.Models

import com.example.newskotlinapp.Models.NewsHeadlines
import java.io.Serializable


class NewsApiResponse : Serializable {
    var status: String? = null
    var totalResults: Int = 0
    var articles: List<NewsHeadlines>? = null
}