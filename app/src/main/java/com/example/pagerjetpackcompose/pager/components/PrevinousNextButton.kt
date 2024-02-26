package com.example.pagerjetpackcompose.pager.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.pagerjetpackcompose.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PrevinousNextButton(pagerState: PagerState) {

    val scope : CoroutineScope = rememberCoroutineScope()

    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {

        Button(onClick = {
            scope.launch {
                pagerState.animateScrollToPage(pagerState.currentPage-1)
            }
        },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent
            )
        ) {

            Text(
                text = "Geri",
                color = Color.LightGray,
                fontWeight = FontWeight.SemiBold
            )

        }

        Button(onClick = {
            scope.launch {
                pagerState.animateScrollToPage(pagerState.currentPage+1)
            }
        }, colors = ButtonDefaults.buttonColors(
            containerColor = colorResource(id = R.color.btn_color)
        ),
            modifier = Modifier.clip(RoundedCornerShape(0.dp))
        ) {

            Text(
                text = "Sonraki",
                color = Color.White,
                fontWeight = FontWeight.SemiBold
            )

        }

    }

}