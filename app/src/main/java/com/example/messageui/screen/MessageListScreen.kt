package com.example.messageui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Brush
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material.icons.outlined.Brush
import androidx.compose.material.icons.outlined.CameraEnhance
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.messageui.Person
import com.example.messageui.R
import com.example.messageui.navigation.NavigationScreen

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun MessageListScreen ( navController: NavController) {
    Column {
        //TopHeader
        Column(

        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp)
                    .padding(2.dp),
                verticalAlignment = Alignment.CenterVertically

            ){
                Card(
                    modifier = Modifier
                        .size(60.dp)
                        .padding(4.dp)
                    ,
                    shape = CircleShape,
                ) {
                    Box(
                        contentAlignment = Alignment.Center
                    ){
                        Image(painter = painterResource(id = R.drawable.menu),
                            contentDescription = null,
                            modifier = Modifier
                                .size(20.dp),
                            alignment = Alignment.Center
                        )
                    }
                }
                Spacer(modifier = Modifier.width(10.dp))
                Text( "Chats", style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.ExtraBold
                )
                )
                Spacer(modifier = Modifier.width(100.dp))
                Card(
                    modifier = Modifier
                        .size(50.dp)
                        .padding(4.dp)
                    ,
                    shape = CircleShape,
                ) {
                    Box(
                        contentAlignment = Alignment.Center
                    ){
                        Icon(
                            imageVector = Icons.Default.CameraAlt,
                            contentDescription = "menu",
                            tint = MaterialTheme.colors.onBackground,
                            modifier = Modifier.size(25.dp)
                        )
                    }
                }
                Card(
                    modifier = Modifier
                        .size(50.dp)
                        .padding(4.dp)
                    ,
                    shape = CircleShape,
                ) {
                    Box(
                        contentAlignment = Alignment.Center
                    ){
                        Icon(
                            imageVector = Icons.Default.Brush,
                            contentDescription = "menu",
                            tint = MaterialTheme.colors.onBackground,
                            modifier = Modifier.size(25.dp)
                        )
                    }
                }
            }

        }

        //ListView
        var personLists = listOf(

            Person("Myo Hset" , R.drawable.rose,"bbbbbbb","me",System.currentTimeMillis(), state = remember {
                mutableStateOf(false)
            }),
            Person("Swe Zin Nyein" , R.drawable.rose1,"bbbbbbb","me",System.currentTimeMillis(), state = remember {
                mutableStateOf(false)
            }),
            Person("Eiei Kyaw" , R.drawable.rose1,"bbbbbbb","me",System.currentTimeMillis(), state = remember {
                mutableStateOf(false)
            })
        )


        Column (
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.9f)

                .padding(5.dp)

        ){
            val text = remember{ mutableStateOf(TextFieldValue("")) }
            TextField(value = text.value, onValueChange = {text.value=it },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
                    .padding(5.dp)
                    .clip(RoundedCornerShape(100.dp)),

                placeholder = {
                    Row() {
                        Image(painter = painterResource(id = R.drawable.pen), contentDescription =null )
                        Spacer(modifier = Modifier.width(5.dp))
                        Text("Search")

                    }
                }
            )


            Row(

            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.width(80.dp)

                ) {
                    Card(
                        modifier = Modifier
                            .size(60.dp)
                            .padding(4.dp),
                        shape = CircleShape,
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.rose),
                            contentDescription = null,
                            modifier = Modifier
                                .size(20.dp),
                            alignment = Alignment.Center
                        )
                    }
                    Text(
                        "Aye Tha", style = TextStyle(
                            fontSize = 13.sp,
                        )
                    )
                }
            }

            Spacer(modifier = Modifier.height(5.dp))
           // MessageList(navController = navController)
            LazyColumn{
                items(personLists){
                        item ->

                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        onClick = {

                            navController.navigate(route = NavigationScreen.MessageConventionScreen.name+"/${item.name}"+"/${item.img}")

                        }
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(10.dp)

                        ){
                            Card(
                                modifier = Modifier
                                    .size(60.dp)
                                    .padding(4.dp),
                                shape = CircleShape,
                            ) {

                                Image(
                                    painter = painterResource(id = item.img),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(20.dp),
                                    alignment = Alignment.Center
                                )
                            }
                            Spacer( modifier = Modifier.width(8.dp))
                            Column(
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier.padding(5.dp)
                            ){
                                Text(text= item.name,style = TextStyle(
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                )
                                Text(text= item.text,style = TextStyle(
                                    fontSize = 13.sp,
                                )
                                )
                            }

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))



                }

            }

            
        }


        //BottomBar
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
        ){
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .width(90.dp)
                    .height(80.dp)
            ) {
                Image(painter = painterResource(id = R.drawable.comment), contentDescription = null,
                    modifier = Modifier.size(30.dp))
                Text("Chats",style = TextStyle(
                    fontSize = 13.sp,
                )
                )

            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .width(90.dp)
                    .height(80.dp)
            ) {
                Image(painter = painterResource(id = R.drawable.call), contentDescription = null,
                    modifier = Modifier.size(30.dp))
                Text("Calls",style = TextStyle(
                    fontSize = 13.sp,
                )
                )

            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .width(90.dp)
                    .height(80.dp),

                ) {
                Image(painter = painterResource(id = R.drawable.people), contentDescription = null,
                    modifier = Modifier.size(30.dp))
                Text("People",style = TextStyle(
                    fontSize = 13.sp,
                )
                )

            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .width(90.dp)
                    .height(80.dp)
            ) {
                Image(painter = painterResource(id = R.drawable.note), contentDescription = null,
                    modifier = Modifier.size(30.dp))
                Text("Stories",style = TextStyle(
                    fontSize = 13.sp,
                )
                )
            }
        }
    }

}

/*
@OptIn(ExperimentalMaterialApi::class)
@Composable
fun MessageList ( navController: NavController,
                  fbViewModel: FbViewModel = viewModel()
                  
                  ){
    val messageList = fbViewModel.getAllPerson()
    LazyColumn{
        items(messageList){
                item ->

            Card(
                modifier = Modifier.fillMaxWidth(),
                onClick = {

                    navController.navigate(route = NavigationScreen.MessageConventionScreen.name+"/${item.name}"+"/${item.img}")

                }
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(10.dp)

                ){
                    Card(
                        modifier = Modifier
                            .size(60.dp)
                            .padding(4.dp),
                        shape = CircleShape,
                    ) {

                        Image(
                            painter = painterResource(id = item.img),
                            contentDescription = null,
                            modifier = Modifier
                                .size(20.dp),
                            alignment = Alignment.Center
                        )
                    }
                    Spacer( modifier = Modifier.width(8.dp))
                    Column(
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier.padding(5.dp)
                    ){
                        Text(text= item.name,style = TextStyle(
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold
                        )
                        )
                        Text(text= item.text,style = TextStyle(
                            fontSize = 13.sp,
                        )
                        )
                    }

                }

            }
            Spacer(modifier = Modifier.height(5.dp))



        }

    }
}*/
