package com.example.happybirthday

import android.graphics.Paint.Align
import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    // 앱에 인사말 추가
                    GreetingImage(message = getString(R.string.happy_birthday_text), from = getString(
                                            R.string.signature_text))
                }
            }
        }
    }
}

// 새 함수 추가
// Text 컴포저블을 내보내는 Compose 함수가 될것이므로 함수 앞에 @Composable 추가
@Composable
fun GreetingText(message : String, from:String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,   // 가운데정렬
        modifier = modifier.padding(8.dp),
    ) {
        Text(
            text = message,
            fontSize = 80.sp,   // 글꼴크기 변경. SP는 글꼴 크기의 측정 단위임.
            // SP와 DP는 단위와 크기가 동일하나, SP에서는 사용자가 휴대전화설정에서 선택한 선호하는 텍스트 크기에 따라 조절됨
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize =  36.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally)    // 그냥 center를 하니까 안됨

        )
    }
}

// 이미지 컴포저블
@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.androidparty)
    Box() {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,   // 매개변수 배율 사용
            alpha = 0.5F,   // 불투명도
        )
        GreetingText(message = message, from = from, modifier = Modifier.fillMaxSize().padding(8.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        GreetingImage(message = "Happy Birthday Sam!", from = "From Emma")
    }
}