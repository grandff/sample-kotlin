package com.example.finalbasic1

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background

import androidx.compose.foundation.layout.*

import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.finalbasic1.ui.theme.FinalBasic1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FinalBasic1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun MainLayout() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFD2E8D4))
    ) {
        Box(
            Modifier.weight(2f)
        ) {
            LogoAndName(fullName = "JeongMin Kim", title = "Android Developer Extraordinaire")
        }
        Column(
            Modifier.weight(1f),
            verticalArrangement = Arrangement.Center,   // 가운데정렬
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            InfoWidget(infoIcon = Icons.Default.Phone, infoTxt = "+11 (123) 444 555 666")
            InfoWidget(infoIcon = Icons.Default.Share, infoTxt = "@AndroidDev")
            InfoWidget(infoIcon = Icons.Default.Email, infoTxt = "android.com@com")
        }

    }
}

@Composable
fun LogoAndName(fullName: String, title: String){
    val image = painterResource(R.drawable.android_logo)
    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,   // 가운데정렬
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Box(
            modifier = Modifier
                .background(Color(0xFF073042))
                .width(80.dp)
                .height(80.dp)
        ) {
            Image(
                painter = image,
                contentDescription = null,
            )
        }
        Text(
            text = fullName,
            textAlign = TextAlign.Center,
            fontSize = 24.sp
        )
        Text(
            text = title,
            textAlign = TextAlign.Center,
            fontSize = 10.sp
        )
    }
}

@Composable
fun InfoWidget(infoIcon: ImageVector, infoTxt: String) {
    Row(
        Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
    ) {
        Box(Modifier.weight(1f), contentAlignment = Alignment.CenterEnd,) {
            androidx.compose.material.Icon(imageVector = infoIcon, contentDescription = null)
        }
        Box(Modifier.weight(2f)) {
            Text(text = infoTxt)
        }

    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FinalBasic1Theme {
        MainLayout()
    }
}