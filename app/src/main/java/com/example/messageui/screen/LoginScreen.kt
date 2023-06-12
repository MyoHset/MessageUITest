package com.example.messageui.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.messageui.R
import com.example.messageui.navigation.NavigationScreen

@SuppressLint("UnrememberedMutableState")
@Composable
fun LoginScreen( navController: NavController) {
    var islogin = remember {
        mutableStateOf(false)
    }

    val textState = remember {
        mutableStateOf("")
    }
    val passwordState = remember {
        mutableStateOf("")
    }
    val isIncorrect = remember {
        mutableStateOf(false)
    }



        Column(
            verticalArrangement = Arrangement.Center ,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(10.dp)
        )
        {
            Column(
                verticalArrangement = Arrangement.Center ,
                horizontalAlignment = Alignment.CenterHorizontally

                ){
                Text(text = "English (US)" , style =
                        TextStyle(fontSize = 10.sp))
                Spacer(modifier = Modifier.height(80.dp))
                Card(
                    modifier = Modifier
                        .size(60.dp)
                        .padding(4.dp),
                    shape = CircleShape,
                    elevation = 6.dp
                ) {

                    Image(
                        painter = painterResource(id = R.drawable.fblogo),
                        contentDescription = null,
                        modifier = Modifier
                            .size(20.dp),
                        alignment = Alignment.Center
                    )
                }
                Spacer(modifier = Modifier.height(80.dp))

                OutlinedTextField(
                    value = textState.value, onValueChange = {
                        textState.value = it },
                    modifier = Modifier.fillMaxWidth(),placeholder = { Text(text = if( isIncorrect.value) "Incorrect Mobile number or email" else "Mobile Number or email",
                        style = TextStyle(
                            color = if (isIncorrect.value) Color.Red else MaterialTheme.colors.onBackground
                        )
                        ) },


                            colors = TextFieldDefaults.outlinedTextFieldColors(

                                unfocusedBorderColor = if (isIncorrect.value) Color.Red else MaterialTheme.colors.onBackground,
                                focusedBorderColor = if (isIncorrect.value) Color.Red else MaterialTheme.colors.onBackground

                            )



                )
                Spacer(modifier = Modifier.height(10.dp))
                OutlinedTextField(
                    value = passwordState.value, onValueChange = {
                        passwordState.value = it },
                    modifier = Modifier.fillMaxWidth(),
                    placeholder = { Text(text = if(isIncorrect.value)  " Incorrect Password" else "Password",
                        style = TextStyle(
                            color = if (isIncorrect.value) Color.Red else MaterialTheme.colors.onBackground
                        )
                        ) },
                    colors = TextFieldDefaults.outlinedTextFieldColors(

                        unfocusedBorderColor = if (isIncorrect.value) Color.Red else MaterialTheme.colors.onBackground,
                        focusedBorderColor = if (isIncorrect.value) Color.Red else MaterialTheme.colors.onBackground
                    )
                )

                Spacer(modifier = Modifier.height(10.dp))
                        Button(
                            onClick = {
                                //islogin.value = !islogin.value

                                if ( textState.value == "mh"  && passwordState.value =="mh"){
                                    navController.navigate(route= NavigationScreen.FbUIScreen.name)

                                }else{
                                    //navController.navigate(route = NavigationScreen.DialogScreen.name)

                                    isIncorrect.value = !isIncorrect.value

                                }
                                textState.value= ""
                                passwordState.value=""


                            },
                            colors= ButtonDefaults.textButtonColors(
                                backgroundColor= Color(59,89,152)),

                            modifier = Modifier
                                .fillMaxWidth()
                                .height(50.dp),
                        ) {

                            Text(text = "Login", color= MaterialTheme.colors.onBackground)

                        }
                        TextButton(onClick = { /*TODO*/ }) {
                            Text(text = "Find your account or password",
                                color= MaterialTheme.colors.onBackground
                            )
                        }
                    }
            Column(modifier= Modifier.padding(20.dp),
                    verticalArrangement = Arrangement.Bottom,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    OutlinedButton(onClick = {

                    },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp),
                        border = BorderStroke(2.dp, Color(59,89,152))
                    ) {
                        Text(text = "Create new account",
                            color= MaterialTheme.colors.onBackground
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Row() {
                        Image(painter = painterResource(id =
                        R.drawable.metalogo), contentDescription = null,
                            modifier = Modifier.size(20.dp))
                        Text(text = " Meta")
                    }
                }
        }


}

@Composable
fun DialogScreen( navController: NavController) {
    val shouldShowDialog = remember{ mutableStateOf(true) }

    if ( shouldShowDialog.value){
        AlertDialog(
            onDismissRequest = { shouldShowDialog.value = false },
            title = { Text(text = "Dialog") },
            text = { Text(text = "Incorrect password") },
            confirmButton = {
                Button( onClick = { shouldShowDialog.value = false
                    navController.navigate(route = NavigationScreen.LoginScreen.name) },
                    ){
                    Text(text = "Comfirm", color = Color.White)
                }
            })
    }
}

