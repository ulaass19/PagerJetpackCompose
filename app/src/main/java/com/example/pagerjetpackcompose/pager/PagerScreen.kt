package com.example.pagerjetpackcompose.pager

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pagerjetpackcompose.pager.components.PageIndicator
import com.example.pagerjetpackcompose.pager.components.PrevinousNextButton
import com.example.pagerjetpackcompose.pager.components.SinglePage
import com.example.pagerjetpackcompose.pager.components.pages

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PagerScreen() {

    val pagerState : PagerState = rememberPagerState(0)

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        
        HorizontalPager(
            pageCount = pages.size,
            state = pagerState
        ) {index : Int ->

            SinglePage(page = pages[index])

        }

        Spacer(modifier = Modifier.size(16.dp))

        PageIndicator(pagerState = pagerState, pageCount = pages.size)

        Spacer(modifier = Modifier.size(220.dp))
        
        PrevinousNextButton(pagerState = pagerState)

    }

}