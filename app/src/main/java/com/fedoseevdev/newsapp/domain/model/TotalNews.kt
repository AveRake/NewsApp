package com.fedoseevdev.newsapp.domain.model

import com.google.gson.annotations.SerializedName

data class TotalNews(
    @SerializedName("status")
    var status: String = String(),

    @SerializedName("totalResults")
    val totalNewsCount: Int = 0,

    @SerializedName("articles")
    var newsList: List<News> = ArrayList()
)
