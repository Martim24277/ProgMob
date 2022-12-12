package com.example.newskotlinapp

import com.example.newskotlinapp.Models.NewsHeadlines

interface OnFetchDataListener<NewsApiResponse> {
    fun onFetchData(list: List<NewsHeadlines?>?, message: String?)
    fun onError(message: String?)
}