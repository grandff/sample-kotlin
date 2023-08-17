package com.example.diceroller

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.diceroller.ui.theme.DiceRollerTheme
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DiceRollerTheme {
                DiceRollerApp()
            }
        }
    }
}


@Preview
@Composable
fun DiceRollerApp() {
    // 사용 가능한 공간을 채우도록 설정
    // 버튼과 이미지를 가운데 오도록 설정
    DiceWithButtonAndImage(modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center))
}

@Composable
fun DiceWithButtonAndImage(modifier: Modifier = Modifier) {
    var result by remember { mutableStateOf(1) }  // 주사위 굴리고 나서 결과값. 값이 재설정 되는걸 방지하기위해서 Remember 사용
    var imageResource = when(result){
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    } // 주사위 숫자에 맞는 이미지 설정
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally, // 화면의 중앙에 배치
    ) {
        // 주사위 이미지 추가
        Image(
            painter = painterResource(imageResource),
            contentDescription = result.toString(),
        )
        // 여백 추가
        Spacer(modifier = Modifier.height(16.dp))
        // 버튼 추가
        Button(onClick = {
            result = (1..6).random()
        }) {
            Text(text = stringResource(R.string.roll))
        }
    }
}