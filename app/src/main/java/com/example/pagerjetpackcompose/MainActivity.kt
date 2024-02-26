package com.example.pagerjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.pagerjetpackcompose.pager.PagerScreen
import com.example.pagerjetpackcompose.ui.theme.PagerJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PagerJetpackComposeTheme {
               PagerScreen()
            }
        }
    }
}