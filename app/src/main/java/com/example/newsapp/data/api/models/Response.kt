package com.example.newsapp.data.api.models

import com.google.gson.annotations.SerializedName

data class Response(
    @SerializedName("status")
    val status: String? = null,
    @SerializedName("totalResults")
    val totalResults: Int? = null,
    @SerializedName("articles")
    val articles: List<Article>? = null
)
