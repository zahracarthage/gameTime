package com.example.gametime.model

import androidx.annotation.DrawableRes

data class MainPosts (
    val Title: String,
    val Content: String,
    @DrawableRes
    val Picture: Int,
)