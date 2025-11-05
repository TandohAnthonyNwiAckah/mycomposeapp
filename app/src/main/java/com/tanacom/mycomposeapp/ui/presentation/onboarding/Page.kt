package com.tanacom.mycomposeapp.ui.presentation.onboarding

import androidx.annotation.DrawableRes
import com.tanacom.mycomposeapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int,
)


val pages = listOf(
    Page(
        title = "Welcome to My Compose App",
        description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
        image = R.drawable.bg1
    ),
    Page(
        title = "Personalize Your Feed",
        description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
        image = R.drawable.bg2
    ),
    Page(
        title = "Stay Informed",
        description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
        image = R.drawable.bg3
    )
)