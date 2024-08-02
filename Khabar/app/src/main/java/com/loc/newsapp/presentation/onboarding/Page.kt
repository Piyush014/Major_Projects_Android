package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int,
)

val pages = listOf(
    Page(
        title = "Stay Informed",
        description = "Get the latest news from around the world, curated just for you.",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Breaking News",
        description = "Be the first to know with real-time notifications on important events.",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Personalized Feed",
        description = "Customize your news feed to see what matters most to you.",
        image = R.drawable.onboarding3
    )
)