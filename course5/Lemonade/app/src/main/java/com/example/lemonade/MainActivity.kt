package com.example.lemonade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lemonade.ui.theme.LemonadeTheme
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LemonadeTheme {
                // A surface container using the 'background' color from the theme
                LemonadeApp()
            }
        }
    }
}

@Preview
@Composable
fun LemonadeApp() {
    TopAppBar(
        Modifier.background(color = Color.Yellow)
    ) {
        Text(text = "Lemonade", textAlign = TextAlign.Center)
    }
    // 화면을 꽉 채우고 정 중앙으로 정렬한다
    LemonTree(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .wrapContentSize(Alignment.Center)
    )
}

@Composable
fun LemonTree(modifier: Modifier = Modifier) {
    var step by remember { mutableStateOf(1) }
    var randomSqueeze by remember {
        mutableStateOf(0)
    }
    var nowSqueeze by remember { mutableStateOf(0) }

    // image 에셋 설정
    var imageResource = when(step){
        1 -> R.drawable.lemon_tree
        2 -> R.drawable.lemon_squeeze
        3 -> R.drawable.lemon_drink
        else -> R.drawable.lemon_restart
    }

    // 텍스트 설정
    var textContentResource = when(step){
        1 -> R.string.text1
        2 -> R.string.text2
        3 -> R.string.text3
        else -> R.string.text4
    }

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Box(
            Modifier
                .background(Color.Green, shape = RoundedCornerShape(48.dp)) // 둥근 모서리 부여
                .width(240.dp)
                .height(240.dp)
                .wrapContentSize(Alignment.Center)
                .clickable {
                    // 4단계 까지 간 경우 처음부터 시작
                    if (step == 4) {
                        step = 1
                    } else {
                        step++
                        when (step) {
                            // 2단계 에서는 랜덤한 숫자만큼 클릭을 해야 진행됨
                            2 -> {
                                if (randomSqueeze == 0) {
                                    randomSqueeze = (1..4).random()
                                }
                                nowSqueeze++
                                // 랜덤 숫자만큼 클릭한 경우 다음 단계로 이동
                                if (nowSqueeze == randomSqueeze) {
                                    step++
                                    nowSqueeze = 0
                                    randomSqueeze = 0
                                }
                            }
                        }
                    }
                }
        ) {
            Image(
                painter = painterResource(imageResource),
                contentDescription = imageResource.toString()
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = stringResource(textContentResource),
            fontSize = 18.sp
        )
    }
}