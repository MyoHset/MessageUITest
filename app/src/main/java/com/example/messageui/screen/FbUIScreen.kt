package com.example.messageui.screen

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.DragIndicator
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.ModeComment
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.OndemandVideo
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.PlayArrow
import androidx.compose.material.icons.outlined.Public
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.Send
import androidx.compose.material.icons.outlined.Share
import androidx.compose.material.icons.outlined.SupervisorAccount
import androidx.compose.material.icons.outlined.ThumbUp
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.messageui.R
import com.example.messageui.navigation.NavigationScreen
import androidx.compose.material.Card as Card

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun FbUIScreen ( navController: NavController){

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()

    ) {
        // facebook Bar
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .padding(2.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween

        ){
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ){
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
                            imageVector = Icons.Outlined.Menu,
                            contentDescription = "menu",
                            tint = MaterialTheme.colors.onBackground,
                            modifier = Modifier.size(30.dp)
                        )
                    }
                }
                Spacer(modifier = Modifier.width(10.dp))
                Text( "facebook", style = TextStyle(
                    fontSize = 24.sp,
                    fontWeight = FontWeight.ExtraBold
                )
                )

            }

           Row (


           ){
               Card(
                   modifier = Modifier
                       .size(50.dp)
                       .padding(4.dp),
                   shape = CircleShape,
               ) {
                   Box(
                       contentAlignment = Alignment.Center
                   ){
                       Icon(
                           imageVector = Icons.Outlined.Search,
                           contentDescription = "menu",
                           tint = MaterialTheme.colors.onBackground,
                           modifier = Modifier.size(30.dp)
                       )
                   }
               }
               Card(
                   modifier = Modifier
                       .size(50.dp)
                       .padding(4.dp),
                   shape = CircleShape,
                   onClick = {
                       navController.navigate(route = NavigationScreen.MessageListScreen.name)
                   }
               ) {
                   Box(
                       contentAlignment = Alignment.Center
                   ){
                       Icon(
                           imageVector = Icons.Outlined.Send,
                           contentDescription = "menu",
                           tint = MaterialTheme.colors.onBackground,
                           modifier = Modifier.size(30.dp)
                       )
                   }
               }

           }

        }

        //Top Bar
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround

        ){
            Column(
                modifier = Modifier
                    .height(50.dp)
                    .width(60.dp)
                    .clickable {

                    },
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center

            ) {
                Icon(
                    imageVector = Icons.Outlined.Home,
                    contentDescription = "menu",
                    tint = MaterialTheme.colors.onBackground,
                    modifier = Modifier.size(30.dp)
                )
            }
            Column(
                modifier = Modifier
                    .height(50.dp)
                    .width(60.dp)
                    .clickable {

                    },
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center

            ) {
                Icon(
                    imageVector = Icons.Outlined.SupervisorAccount,
                    contentDescription = "menu",
                    tint = MaterialTheme.colors.onBackground,
                    modifier = Modifier.size(30.dp)
                )
            }
            Column(
                modifier = Modifier
                    .height(50.dp)
                    .width(60.dp)
                    .clickable {

                    },
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center

            ) {
                Icon(
                    imageVector = Icons.Outlined.OndemandVideo,
                    contentDescription = "menu",
                    tint = MaterialTheme.colors.onBackground,
                    modifier = Modifier.size(30.dp)
                )
            }
            Column(
                modifier = Modifier
                    .height(50.dp)
                    .width(60.dp)
                    .clickable {

                    },
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center

            ) {
                Icon(
                    imageVector = Icons.Outlined.AccountCircle,
                    contentDescription = "menu",
                    tint = MaterialTheme.colors.onBackground,
                    modifier = Modifier.size(30.dp)
                )
            }
            Column(
                modifier = Modifier
                    .height(50.dp)
                    .width(60.dp)
                    .clickable {

                    },
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center

            ) {
                Icon(
                    imageVector = Icons.Outlined.Notifications,
                    contentDescription = "menu",
                    tint = MaterialTheme.colors.onBackground,
                    modifier = Modifier.size(30.dp)
                )
            }
            Column(
                modifier = Modifier
                    .height(50.dp)
                    .width(60.dp)
                    .clickable {

                    },
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,


            ) {
                Icon(
                    imageVector = Icons.Outlined.Menu,
                    contentDescription = "menu",
                    tint = MaterialTheme.colors.onBackground,
                    modifier = Modifier.size(30.dp)
                )
            }
        }

        Divider(color= MaterialTheme.colors.onBackground, thickness = 0.5.dp)

        //Post Lists
        Column(
            modifier= Modifier.padding(8.dp)

        ){
            Card(
                modifier= Modifier
                    .fillMaxWidth(),
                elevation = 8.dp,

            ){
                Column(
                ){
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(60.dp)
                            .padding(horizontal = 5.dp, vertical = 5.dp),
                        horizontalArrangement = Arrangement.SpaceBetween


                    ){
                        Row(
                            horizontalArrangement = Arrangement.Start


                        ){
                            Card(
                                modifier = Modifier
                                    .size(40.dp)
                                    .padding(4.dp),
                                shape = CircleShape,

                                ) {
                                Image(painter = painterResource(id = R.drawable.rose1),
                                    contentDescription = null,
                                    alignment = Alignment.Center
                                )
                            }
                            Spacer(modifier = Modifier.width(10.dp))
                            Column(){
                                Text("Rose", style = TextStyle(
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                )
                                Row(){
                                    Text("3d", style = TextStyle(
                                        fontSize = 10.sp,
                                        fontWeight = FontWeight.Bold
                                    ))
                                    Spacer(modifier = Modifier.width(10.dp))
                                    Surface (
                                        modifier = Modifier.size(15.dp)
                                    ){
                                        Icon(
                                            imageVector = Icons.Outlined.Public,
                                            contentDescription = "menu",
                                            tint = MaterialTheme.colors.onBackground,

                                        )

                                    }

                                }

                            }

                        }


                        Row(

                            horizontalArrangement = Arrangement.End,


                        ){
                            Icon(
                                imageVector = Icons.Outlined.DragIndicator,
                                contentDescription = "menu",
                                tint = MaterialTheme.colors.onBackground,
                                modifier = Modifier.size(20.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Icon(
                                imageVector = Icons.Default.Close,
                                contentDescription = "menu",
                                tint = MaterialTheme.colors.onBackground,
                                modifier = Modifier.size(20.dp)
                            )

                        }

                    }
                    //status
                    Box(modifier= Modifier
                        .padding(horizontal = 10.dp, vertical = 12.dp)
                        .fillMaxWidth()
                    ){
                        Text("Making an image rounded corner is something which will make UI more attractive. So most of the designers will ask the developers to make that in their UI.",
                            style = TextStyle(
                                fontSize = 13.sp,
                            )
                        )
                    }

                    //like and Heart
                    Row(
                        modifier= Modifier
                            .fillMaxWidth()

                            .padding(10.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        Row(
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            Image(painter = painterResource(id = R.drawable.like), contentDescription =null,
                                modifier= Modifier.size(15.dp))
                            Image(painter = painterResource(id = R.drawable.heart), contentDescription =null,
                                modifier= Modifier.size(12.dp))
                            Spacer(modifier= Modifier.width(3.dp))
                            Text("110", style = TextStyle(
                                fontSize = 12.sp,
                            ))

                        }
                        Row() {
                            Text("4 comments . 5 shares", style = TextStyle(
                                fontSize = 11.sp,
                            ))
                        }
                    }
                    Divider(color= Color.Gray, thickness = 0.2.dp)

                    //Like Comment Share
                    Row(
                        modifier= Modifier
                            .fillMaxWidth()
                            .height(45.dp),

                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceAround
                    ){
                        Column (
                            modifier= Modifier
                                .width(113.dp)
                                .height(45.dp)
                                .clickable {

                                },
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){
                            Row(
                            ){
                                Icon(
                                    imageVector = Icons.Outlined.ThumbUp,
                                    contentDescription = "menu",
                                    tint = MaterialTheme.colors.onBackground,
                                    modifier = Modifier.size(20.dp)
                                )
                                Spacer(modifier= Modifier.width(2.dp))
                                Text("Like", style = TextStyle(
                                    fontSize = 13.sp,
                                ))
                            }

                        }
                        Column (
                            modifier= Modifier
                                .width(112.dp)
                                .height(45.dp)
                                .clickable {

                                },
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){
                            Row(
                            ){
                                Icon(
                                    imageVector = Icons.Outlined.ModeComment,
                                    contentDescription = "menu",
                                    tint = MaterialTheme.colors.onBackground,
                                    modifier = Modifier.size(20.dp)
                                )
                                Spacer(modifier= Modifier.width(2.dp))
                                Text("Comments", style = TextStyle(
                                    fontSize = 13.sp,
                                ))
                            }

                        }
                        Column (
                            modifier= Modifier
                                .width(113.dp)
                                .height(45.dp)
                                .clickable {

                                },
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){
                            Row(
                            ){
                                Icon(
                                    imageVector = Icons.Outlined.Share,
                                    contentDescription = "menu",
                                    tint = MaterialTheme.colors.onBackground,
                                    modifier = Modifier.size(20.dp)
                                )
                                Spacer(modifier= Modifier.width(2.dp))
                                Text("Share", style = TextStyle(
                                    fontSize = 13.sp,
                                ))
                            }

                        }



                    }

                }


            }
            Spacer( modifier = Modifier.height(10.dp))
            Card(
                modifier= Modifier
                    .fillMaxWidth(),
                elevation = 8.dp,

                ){
                Column(
                ){
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(60.dp)
                            .padding(horizontal = 5.dp, vertical = 5.dp),
                        horizontalArrangement = Arrangement.SpaceBetween


                    ){
                        Row(
                            horizontalArrangement = Arrangement.Start


                        ){
                            Card(
                                modifier = Modifier
                                    .size(40.dp)
                                    .padding(4.dp),
                                shape = CircleShape,

                                ) {
                                Image(painter = painterResource(id = R.drawable.rose1),
                                    contentDescription = null,
                                    alignment = Alignment.Center
                                )
                            }
                            Spacer(modifier = Modifier.width(10.dp))
                            Column(){
                                Text("Rose", style = TextStyle(
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                )
                                Row(){
                                    Text("3d", style = TextStyle(
                                        fontSize = 10.sp,
                                        fontWeight = FontWeight.Bold
                                    ))
                                    Spacer(modifier = Modifier.width(10.dp))
                                    Surface (
                                        modifier = Modifier.size(15.dp)
                                    ){
                                        Icon(
                                            imageVector = Icons.Outlined.Public,
                                            contentDescription = "menu",
                                            tint = MaterialTheme.colors.onBackground,

                                            )

                                    }

                                }

                            }

                        }


                        Row(

                            horizontalArrangement = Arrangement.End,


                            ){
                            Icon(
                                imageVector = Icons.Outlined.DragIndicator,
                                contentDescription = "menu",
                                tint = MaterialTheme.colors.onBackground,
                                modifier = Modifier.size(20.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Icon(
                                imageVector = Icons.Default.Close,
                                contentDescription = "menu",
                                tint = MaterialTheme.colors.onBackground,
                                modifier = Modifier.size(20.dp)
                            )

                        }

                    }
                    //status
                    Box(modifier= Modifier
                        .padding(horizontal = 10.dp, vertical = 12.dp)
                        .fillMaxWidth()
                    ){
                        Text("Making an image rounded corner is something which will make UI more attractive. So most of the designers will ask the developers to make that in their UI.",
                            style = TextStyle(
                                fontSize = 13.sp,
                            )
                        )
                    }

                    //like and Heart
                    Row(
                        modifier= Modifier
                            .fillMaxWidth()

                            .padding(10.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        Row(
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            Image(painter = painterResource(id = R.drawable.like), contentDescription =null,
                                modifier= Modifier.size(15.dp))
                            Image(painter = painterResource(id = R.drawable.heart), contentDescription =null,
                                modifier= Modifier.size(12.dp))
                            Spacer(modifier= Modifier.width(3.dp))
                            Text("110", style = TextStyle(
                                fontSize = 12.sp,
                            ))

                        }
                        Row() {
                            Text("4 comments . 5 shares", style = TextStyle(
                                fontSize = 11.sp,
                            ))
                        }
                    }
                    Divider(color= Color.Gray, thickness = 0.2.dp)

                    //Like Comment Share
                    Row(
                        modifier= Modifier
                            .fillMaxWidth()
                            .height(45.dp),

                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceAround
                    ){
                        Column (
                            modifier= Modifier
                                .width(113.dp)
                                .height(45.dp)
                                .clickable {

                                },
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){
                            Row(
                            ){
                                Icon(
                                    imageVector = Icons.Outlined.ThumbUp,
                                    contentDescription = "menu",
                                    tint = MaterialTheme.colors.onBackground,
                                    modifier = Modifier.size(20.dp)
                                )
                                Spacer(modifier= Modifier.width(2.dp))
                                Text("Like", style = TextStyle(
                                    fontSize = 13.sp,
                                ))
                            }

                        }
                        Column (
                            modifier= Modifier
                                .width(112.dp)
                                .height(45.dp)
                                .clickable {

                                },
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){
                            Row(
                            ){
                                Icon(
                                    imageVector = Icons.Outlined.ModeComment,
                                    contentDescription = "menu",
                                    tint = MaterialTheme.colors.onBackground,
                                    modifier = Modifier.size(20.dp)
                                )
                                Spacer(modifier= Modifier.width(2.dp))
                                Text("Comments", style = TextStyle(
                                    fontSize = 13.sp,
                                ))
                            }

                        }
                        Column (
                            modifier= Modifier
                                .width(113.dp)
                                .height(45.dp)
                                .clickable {

                                },
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){
                            Row(
                            ){
                                Icon(
                                    imageVector = Icons.Outlined.Share,
                                    contentDescription = "menu",
                                    tint = MaterialTheme.colors.onBackground,
                                    modifier = Modifier.size(20.dp)
                                )
                                Spacer(modifier= Modifier.width(2.dp))
                                Text("Share", style = TextStyle(
                                    fontSize = 13.sp,
                                ))
                            }

                        }



                    }

                }


            }


        }



    }
}