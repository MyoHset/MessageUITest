package com.example.messageui.navigation

import com.example.messageui.screen.MessageListScreen

enum class NavigationScreen {



    LoginScreen,
    FbUIScreen,
    MessageListScreen,
    DialogScreen,
    MessageConventionScreen;
    companion object{
        fun fromRoute ( route: String?) : NavigationScreen
                = when (route?.substringBefore("/")){

            LoginScreen.name -> LoginScreen
            FbUIScreen.name -> FbUIScreen
            MessageListScreen.name -> MessageListScreen
            DialogScreen.name -> DialogScreen
            MessageConventionScreen.name -> MessageConventionScreen
            null -> MessageListScreen
            else -> throw IllegalArgumentException("Route $route is not regonize")
        }
    }


}