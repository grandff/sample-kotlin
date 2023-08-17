package com.example.practicebasic1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practicebasic1.ui.theme.PracticeBasic1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PracticeBasic1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TaskManager(
                        title = "All tasks completed",
                        subTitle = "Nice work!"
                    )
                }
            }
        }
    }
}

@Composable
fun Compose4Screen(
    title1: String,
    subTitle1: String,
    color1: Color,
    title2: String,
    subTitle2: String,
    color2: Color,
    title3: String,
    subTitle3: String,
    color3: Color,
    title4: String,
    subTitle4: String,
    color4: Color,
    modifier: Modifier = Modifier
){
    Column(
        Modifier.fillMaxWidth(),
    ) {
        Row(
            Modifier.weight(1f)
        ) {
            // compose 1
            Column(
                modifier = modifier.fillMaxSize()
                    .background(color1)
                    .padding(16.dp)
            ) {
                Text(text = title1)
                Text(text = subTitle1)
            }
            // compose 2
            Column(
                modifier = modifier.fillMaxSize()
                    .background(color2)
                    .padding(16.dp)
            ) {
                Text(text = title2)
                Text(text = subTitle2)
            }
        }
        Row(
            Modifier.weight(1f)
        ) {
            // compose 3
            Column(
                modifier = modifier.fillMaxSize()
                    .background(color3)
                    .padding(16.dp)
            ) {
                Text(text = title3)
                Text(text = subTitle3)
            }
            // compose 4
            Column(
                modifier = modifier.fillMaxSize()
                    .background(color4)
                    .padding(16.dp)
            ) {
                Text(text = title4)
                Text(text = subTitle4)
            }
        }
    }
}

@Composable
fun TaskManager(title: String, subTitle: String, modifier: Modifier = Modifier) {
    val mainImage = painterResource(R.drawable.ic_task_completed)
    Column(
        verticalArrangement = Arrangement.Center,   // 가운데정렬
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize(),
    ) {
        Image(
            painter = mainImage,
            contentDescription = null,
        )
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(
                    top = 24.dp,
                    bottom = 8.dp,
                ),
        )
        Text(
            text = subTitle,
            fontSize = 16.sp
        )
    }
}

@Composable
fun PracticeScreen(title: String, mainContent: String, subContent: String, modifier: Modifier = Modifier) {
    val backgroundImage = painterResource(R.drawable.bg_compose_background)
    Column() {
        Image(
            painter = backgroundImage,
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
        )
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp),
        )
        Text(
            text = mainContent,
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    end = 16.dp,
                ),
            textAlign = TextAlign.Justify,
        )
        Text(
            text = subContent,
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Justify,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PracticeBasic1Theme {
        Compose4Screen(
            title1 = "Text composable",
            subTitle1 = "Displays text and follows the recommended Material Design guidelines.\n",
            color1 = Color(0xFFEADDFF),
            title2 = "Image composable",
            subTitle2 = "Creates a composable that lays out and draws a given Painter class object.\n",
            color2 = Color(0xFFD0BCFF),
            title3 = "Row composable",
            subTitle3 = "A layout composable that places its children in a horizontal sequence.",
            color3 = Color(0xFFB69DF8),
            title4 = "Column composable",
            subTitle4 = "A layout composable that places its children in a vertical sequence.",
            color4 = Color(0xFFF6EDFF),
        )
    }
}