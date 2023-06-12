package com.example.messageui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.messageui.screen.DialogScreen
import com.example.messageui.screen.FbUIScreen
import com.example.messageui.screen.LoginScreen
import com.example.messageui.screen.MessageConventionScreen
import com.example.messageui.screen.MessageListScreen

@Composable
fun Navigator () {
    val navController = rememberNavController()
    NavHost (navController = navController, startDestination = NavigationScreen.LoginScreen.name){

        composable(NavigationScreen.LoginScreen.name){
            ///here we pass where this should lead us to
            LoginScreen(navController = navController)
        }

        composable(NavigationScreen.FbUIScreen.name){
            ///here we pass where this should lead us to
            FbUIScreen(navController = navController)
        }

        composable(NavigationScreen.MessageListScreen.name){
            ///here we pass where this should lead us to
            MessageListScreen(navController = navController)
        }

        composable(NavigationScreen.DialogScreen.name){
            ///here we pass where this should lead us to
            DialogScreen(navController = navController)
        }

        composable(NavigationScreen.MessageConventionScreen.name + "/{name}" +"/{img}",
                arguments = listOf(
                    navArgument(name ="name"){type = NavType.StringType},
                    navArgument(name ="img"){type = NavType.IntType}
                )
            ){ backStackEntry ->
            ///here we pass where this should lead us to
            MessageConventionScreen(navController = navController,
                backStackEntry.arguments?.getString("name"),backStackEntry.arguments?.getInt("img")!!)
        }
        // www.google.com/detail-screen/id=34
        /*composable( NavigationScreen.MessageConventionScreen.name + "/{personInfo}",
            arguments = listOf( navArgument(name = "personInfo"){ type = NavType.ReferenceType} )
        ){ backStackEntry ->
            MessageConventionScreen(navController = navController,backStackEntry.arguments?.get("personInfo"))

        }*/

        /*composable( MovieScreens.DetailScreen.name +"/{movie}",
            arguments = listOf(navArgument(name="movie"){type = NavType.StringType})
        ){ backStackEntry ->
            DetailScreen(navController=navController,backStackEntry.arguments?.getString("movie"))
        }*/

    }
}