package com.example.messageui

import android.annotation.SuppressLint
import android.graphics.drawable.Icon
import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items


import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.messageui.navigation.Navigator
import com.example.messageui.screen.FbUIScreen
import com.example.messageui.screen.LoginScreen
import com.example.messageui.screen.MessageConventionScreen
import com.example.messageui.screen.MessageListScreen
import com.example.messageui.ui.theme.MessageUITheme
import androidx.compose.foundation.layout.Row as Row

class MainActivity : ComponentActivity() {
    @SuppressLint("SuspiciousIndentation")
    @OptIn(ExperimentalMaterialApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp{
                Navigator()
            }
        }
    }
}

@Composable
fun MyApp ( content: @Composable () -> Unit) {
    MessageUITheme {
        // A surface container using the 'background' color from the theme
        Surface(

            color = MaterialTheme.colors.background
        ) {
            content()

        }
    }
}

@Composable
fun TopHeader () {




}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ListView () {



}

@Composable
fun BottomButton (){

}





@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MessageUITheme {
        MyApp {

        }
    }
}