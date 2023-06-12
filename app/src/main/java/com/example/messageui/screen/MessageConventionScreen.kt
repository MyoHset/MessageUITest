package com.example.messageui.screen

import android.content.Context
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.darkColors
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Send
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.room.Room
import androidx.room.Room.databaseBuilder
import com.example.messageui.Person
import com.example.messageui.R
import com.example.messageui.User
import com.example.messageui.UserDatabase

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.lang.System.currentTimeMillis
import java.text.SimpleDateFormat
import java.util.Locale
import androidx.compose.foundation.layout.Column as Column



@OptIn(ExperimentalMaterialApi::class)
@Composable
fun MessageConventionScreen (navController: NavController, personData: String?,img:Int) {
    //var data = Gson().fromJson(personData,Person::class.java)
    Surface(
        modifier = Modifier.fillMaxSize(),
        ) {

        val context = LocalContext.current

        var datalist = remember {
            mutableListOf<User>()
        }

        var isOnOff by remember {
            mutableStateOf(false)
        }

        var otherListData by remember {
            mutableStateOf(listOf<String>())
        }


        var listData by remember {
            mutableStateOf(listOf<Person>())
        }

        LaunchedEffect(key1 = Unit, block = {
            datalist.clear()
            datalist.addAll(getdata(context = context))
        })

        Scaffold(
            topBar = {
                Column() {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(56.dp),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically


                        ) {
                            Surface(
                                onClick = {
                                    navController.popBackStack()

                                },
                                shape = RectangleShape,
                                modifier = Modifier
                                    .padding(horizontal = 8.dp, vertical = 8.dp)
                                    .size(30.dp)
                                    .height(30.dp)

                            ) {
                                Icon(
                                    imageVector = Icons.Default.ArrowBack,
                                    contentDescription = "back",
                                    tint = androidx.compose.ui.graphics.Color(0xFF5566ee)
                                )

                            }
                            androidx.compose.material.Card(
                                modifier = Modifier
                                    .size(40.dp)
                                    .padding(4.dp),
                                shape = CircleShape,
                            ) {

                                Image(
                                    painter = painterResource(id = img),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(20.dp),
                                    alignment = Alignment.Center
                                )
                            }
                            Spacer(modifier = Modifier.width(5.dp))
                            Text(
                                text = personData.toString(), style = TextStyle(
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            )

                        }

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(40.dp),
                            horizontalArrangement = Arrangement.End,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Surface(
                                onClick = {

                                },
                                shape = RectangleShape,

                                modifier = Modifier
                                    .padding(horizontal = 8.dp, vertical = 8.dp)
                                    .size(30.dp)
                                    .height(30.dp)

                            ) {
                                Icon(
                                    imageVector = Icons.Default.Call,
                                    contentDescription = "back",
                                    tint = androidx.compose.ui.graphics.Color(0xFF5566ee)
                                )

                            }
                            Surface(
                                onClick = {

                                },
                                shape = RectangleShape,

                                modifier = Modifier
                                    .padding(horizontal = 8.dp, vertical = 8.dp)
                                    .size(30.dp)
                                    .height(30.dp)

                            ) {
                                Icon(
                                    imageVector = Icons.Default.Home,
                                    contentDescription = "back",
                                    tint = androidx.compose.ui.graphics.Color(0xFF5566ee)
                                )

                            }
                            Surface(
                                onClick = {

                                },
                                shape = RectangleShape,

                                modifier = Modifier
                                    .padding(horizontal = 8.dp, vertical = 8.dp)
                                    .size(30.dp)
                                    .height(30.dp)

                            ) {
                                Icon(
                                    imageVector = Icons.Default.Info,
                                    contentDescription = "back",
                                    tint = androidx.compose.ui.graphics.Color(0xFF5566ee)
                                )
                            }
                        }
                    }

                    Button(
                        onClick = {
                            isOnOff = !isOnOff

                        }
                    ) {
                        Text(text = if (isOnOff) "Turn off" else "Turn on")
                    }

                }
            },

            content = { it ->
                Column(modifier = Modifier.padding(it)) {
                    val dateFormat = SimpleDateFormat("HH:mm a", Locale.getDefault())
                    val dateFormat2 = SimpleDateFormat("EEE")

                    /*val personList = listOf(
                        Person("Myo Hset","ljoijmknuo","me",System.currentTimeMillis()-1215181,state = remember{
                            mutableStateOf(false)
                        }),
                        Person("EiEi Kyaw","ljoijmknuo","other",System.currentTimeMillis()-1215181, state = remember{
                            mutableStateOf(false)
                        }),
                        Person("Myo Hset","ljoijmknuo","me",System.currentTimeMillis()-1215181,state = remember{
                            mutableStateOf(false)
                        }),
                        Person("Myo Hset","ljoijmknuo","other",System.currentTimeMillis()-1215181,state = remember{
                            mutableStateOf(false)
                        }),
                        Person("Myo Hset","ljoijmknuo","me",System.currentTimeMillis()-1215181,state = remember{
                            mutableStateOf(false)
                        }),
                        Person("Myo Hset","ljoijmknuo","other",System.currentTimeMillis()-1215181,state = remember{
                            mutableStateOf(false)
                        }),
                    )*/

                    var data1 = getdata( context = context)
                    datalist.addAll(data1)
                    LazyColumn(

                    ) {
                        var size = datalist.size
                        items(datalist) { item ->
                            var count = datalist.indexOf(item)
                            if (item.type.equals("me")) {
                                Column(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalAlignment = Alignment.End,
                                ) {
                                    Card(
                                        onClick = {
                                            item.state = !item.state
                                        }
                                    ) {
                                        Column(
                                            horizontalAlignment = Alignment.End,
                                            modifier = Modifier.padding(5.dp),
                                        ) {
                                            Text(text = item.text)
                                        }
                                    }
                                    ClickableText(text =
                                    buildAnnotatedString { append("") },
                                        onClick = { item.state = !item.state })
                                    if (item.state)
                                        Text(
                                            text = dateFormat2.format(item)
                                                .plus(" AT ${dateFormat.format(item)}"),
                                            fontSize = 8.sp
                                        )
                                }
                            } else {
                                Row(
                                    verticalAlignment = Alignment.CenterVertically

                                ) {
                                    if (count == datalist.size - 1 && isOnOff == false) {
                                        androidx.compose.material.Card(
                                            modifier = Modifier
                                                .size(30.dp)
                                                .padding(4.dp),
                                            shape = CircleShape,
                                        ) {

                                            Image(
                                                painter = painterResource(id = img),
                                                contentDescription = null,
                                                modifier = Modifier
                                                    .size(20.dp),
                                                alignment = Alignment.Center
                                            )
                                        }
                                        Spacer(modifier = Modifier.width(10.dp))
                                        Column(
                                            modifier = Modifier.fillMaxWidth(),
                                            horizontalAlignment = Alignment.Start

                                        ) {
                                            Card(
                                                onClick = {
                                                    item.state= !item.state
                                                }
                                            ) {
                                                Column(
                                                    horizontalAlignment = Alignment.Start,
                                                    modifier = Modifier.padding(8.dp),

                                                    ) {
                                                    Text(text = item.text)
                                                }
                                            }

                                            ClickableText(text =
                                            buildAnnotatedString { append("") },
                                                onClick = {
                                                    item.state = !item.state
                                                })
                                            if (item.state)
                                                Text(
                                                    text = dateFormat2.format(item.time)
                                                        .plus(" AT ${dateFormat.format(item.time)}"),
                                                    fontSize = 8.sp
                                                )
                                        }

                                    } else {
                                        if (count < datalist.size - 1) {
                                            count++
                                            if (datalist[count].type == "me") {
                                                androidx.compose.material.Card(
                                                    modifier = Modifier
                                                        .size(30.dp)
                                                        .padding(4.dp),
                                                    shape = CircleShape,
                                                ) {

                                                    Image(
                                                        painter = painterResource(id = img),
                                                        contentDescription = null,
                                                        modifier = Modifier
                                                            .size(20.dp),
                                                        alignment = Alignment.Center
                                                    )
                                                }

                                            } else {

                                                Column(
                                                    modifier = Modifier
                                                        .size(30.dp)
                                                        .padding(4.dp),

                                                    ) {

                                                    /*Image(
                                                        painter = painterResource(id = R.drawable.rose1),
                                                        contentDescription = null,
                                                        modifier = Modifier
                                                            .size(20.dp),
                                                        alignment = Alignment.Center
                                                    )*/
                                                }

                                            }

                                            Spacer(modifier = Modifier.width(5.dp))
                                            Column(
                                                modifier = Modifier.fillMaxWidth(),
                                                horizontalAlignment = Alignment.Start

                                            ) {
                                                Card(
                                                    onClick = {
                                                        item.state = !item.state
                                                    }
                                                ) {
                                                    Column(
                                                        horizontalAlignment = Alignment.Start,
                                                        modifier = Modifier.padding(8.dp),

                                                        ) {
                                                        Text(text = item.text)
                                                    }
                                                }

                                                ClickableText(text =
                                                buildAnnotatedString { append("") },
                                                    onClick = {
                                                        item.state= !item.state
                                                    })
                                                if (item.state)
                                                    Text(
                                                        text = dateFormat2.format(item.time)
                                                            .plus(
                                                                " AT ${
                                                                    dateFormat.format(
                                                                        item.time
                                                                    )
                                                                }"
                                                            ),
                                                        fontSize = 8.sp
                                                    )
                                            }

                                        }


                                    }


                                }
                            }
                        }

                    }


                }

            },
            bottomBar = {
                var textField by remember {
                    mutableStateOf("")
                }
                Row(
                    modifier = Modifier

                        .height(50.dp)
                        .fillMaxWidth()
                        .padding(5.dp),

                    verticalAlignment = Alignment.CenterVertically

                ) {

                    Surface(
                        onClick = {

                        },
                        shape = RectangleShape,

                        modifier = Modifier
                            .padding(horizontal = 8.dp, vertical = 8.dp)
                            .size(30.dp)
                            .height(30.dp)

                    ) {
                        Icon(
                            imageVector = Icons.Default.Home,
                            contentDescription = "menu",
                            tint = androidx.compose.ui.graphics.Color(0xFF5566ee)
                        )
                    }
                    Surface(
                        onClick = {

                        },
                        shape = RectangleShape,

                        modifier = Modifier
                            .padding(horizontal = 8.dp, vertical = 8.dp)
                            .size(30.dp)
                            .height(30.dp)

                    ) {
                        Icon(
                            imageVector = Icons.Default.List,
                            contentDescription = "menu",
                            tint = androidx.compose.ui.graphics.Color(0xFF5566ee)
                        )
                    }
                    Surface(
                        onClick = {

                        },
                        shape = RectangleShape,
                        modifier = Modifier
                            .padding(horizontal = 8.dp, vertical = 8.dp)
                            .size(30.dp)
                            .height(30.dp)

                    ) {
                        Icon(
                            imageVector = Icons.Default.DateRange,
                            contentDescription = "menu",
                            tint = androidx.compose.ui.graphics.Color(0xFF5566ee)
                        )

                    }
                    Surface(
                        onClick = {

                        },
                        shape = RectangleShape,
                        modifier = Modifier
                            .padding(horizontal = 8.dp, vertical = 8.dp)
                            .size(30.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Face,
                            contentDescription = "menu",
                            tint = androidx.compose.ui.graphics.Color(0xFF5566ee)
                        )
                    }

                    OutlinedTextField(
                        value = textField, onValueChange = { textField = it },
                        modifier = Modifier.width(104.dp),
                        placeholder = {
                            Text(
                                text = "Message", style = TextStyle(
                                    fontSize = 8.sp
                                )
                            )
                        },
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            focusedBorderColor = Color(0xFF5566ee),
                            unfocusedBorderColor = Color(0xFF5566ee)

                        )

                    )

                    Surface(
                        onClick = {
                            var s = if (isOnOff) "me" else "other"

                            /*listData = listData.plus(
                                    Person(
                                        name = "MMM",
                                        img = img,
                                        text = textField,
                                        type = if (isOnOff) "me" else "other",
                                        date = System.currentTimeMillis(),
                                        state = mutableStateOf(false)
                                    )
                                )*/
                            val user = User(
                                text = textField,
                                type = if (isOnOff) "me" else "other",
                                state = false,
                                time = currentTimeMillis()
                            )

                            val db = databaseBuilder(
                                context = context,
                                UserDatabase::class.java,
                                "chatData"
                            ).fallbackToDestructiveMigration().build()

                            GlobalScope.launch {
                                db.dao().insertUser_other(
                                    user = user
                                )
                                //datalist.clear()
                                var data = getdata( context = context)
                                datalist.addAll(data)
                                Log.d(">>>>>>", "$data / ${datalist.size}")
                            }

                            if (s.equals("other")) {
                                otherListData.plus(textField)
                            }
                            textField = ""

                        },
                        shape = RectangleShape,
                        modifier = Modifier
                            .padding(horizontal = 8.dp, vertical = 8.dp)
                            .size(30.dp)
                            .height(30.dp)

                    ) {
                        Icon(
                            imageVector = Icons.Default.Send,
                            contentDescription = "menu",
                            tint = androidx.compose.ui.graphics.Color(0xFF5566ee)
                        )
                    }
                }

            }
        )

    }
}

fun getdata(context: Context): List<User> {
    var data : List<User> = emptyList()
    val db = Room.databaseBuilder(context,
        UserDatabase::class.java, "chatData")
        .allowMainThreadQueries().fallbackToDestructiveMigration().build()
    data = db.dao().getAllUsers()
    Log.d("data>>> ", "$data")
    return data
}


//Top bar


// Content bar


//bottom bar
