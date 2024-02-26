package com.example.pagerjetpackcompose.pager.components

import androidx.annotation.DrawableRes
import com.example.pagerjetpackcompose.FIRST_SCREEN
import com.example.pagerjetpackcompose.FOURTH_SCREEN
import com.example.pagerjetpackcompose.R
import com.example.pagerjetpackcompose.SECOND_SCREEN
import com.example.pagerjetpackcompose.THIRD_SCREEN

data class Page(
    val title : String,
    val desc : String,
    @DrawableRes val image : Int
)

val pages : List<Page> = listOf(
    Page(
        title = "İşinizi Arayın",
        desc = FIRST_SCREEN,
        image = R.drawable.first_page
    ),
    Page(
        title = "En İyi İşçini Bul",
        desc = SECOND_SCREEN,
        image = R.drawable.second_page
    ),
    Page(
        title = "Hızlı ve Kolay İş Bul",
        desc = THIRD_SCREEN,
        image = R.drawable.third_page
    ),
    Page(
    title = "İstediğiniz İşi Yaratın",
    desc = FOURTH_SCREEN,
    image = R.drawable.fourth_page
)
)