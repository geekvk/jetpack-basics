@file:OptIn(ExperimentalFoundationApi::class)

package com.mobitel.advancedjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.tween
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mobitel.advancedjetpack.ui.theme.AdvancedjetpackTheme
import com.mobitel.advancedjetpack.ui.theme.UIScreenInterests

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AdvancedjetpackTheme {
                // A surface container using the 'background' color from the theme
//                ViewPagerJetpack()
                UIScreenInterests()
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ViewPagerJetpack(){
    var pagerState = rememberPagerState(0,0F)
    Box(
        modifier = Modifier.fillMaxHeight()
    ) {
        HorizontalPager(pageCount = 5, state = pagerState) {
            Box(modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ){
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    when(pagerState.currentPage){
                        0 -> {
                            Image(
                                painter = painterResource(id = R.drawable.img1),
                                contentDescription = null,
                                modifier = Modifier
                                    .width(400.dp)
                                    .height(700.dp)
                                )
                        }
                        1 -> {
                            Image(
                                painter = painterResource(id = R.drawable.img2),
                                contentDescription = null,
                                modifier = Modifier
                                    .width(400.dp)
                                    .height(700.dp)
                            )
                        }
                        2 -> {
                            Image(
                                painter = painterResource(id = R.drawable.img3),
                                contentDescription = null,
                                modifier = Modifier
                                    .width(400.dp)
                                    .height(700.dp)
                            )
                        }
                    }
                    LaunchedEffect(Unit){
                        pagerState.animateScrollToPage(0, 0F, animationSpec = tween(500))
                    }
                    Text(text = "Page ${pagerState.currentPage + 1}")
                }
            }

        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp)
                .align(Alignment.BottomCenter),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row {
                repeat(5){
                    CustomIndicators(isSelected = pagerState.currentPage == it)
                }
            }

        }
    }
}

@Composable
fun CustomIndicators(isSelected: Boolean) {
    Box(modifier = Modifier
        .padding(2.dp)
        .background(color = if (isSelected) Color.Red else Color.Green, shape = CircleShape)
        .size(15.dp)
    )

}
