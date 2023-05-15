package com.example.wizardcode.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.wizardcode.screens.SplashScreen
import com.example.wizardcode.screens.home.HomeScreen
import com.example.wizardcode.screens.login.LoginScreen

@Composable
fun Navigation(){

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screens.SplashScreen.name
    ) {
        composable(Screens.SplashScreen.name) {
            SplashScreen(navController = navController)
        }

        composable(Screens.LoginScreen.name){
            LoginScreen(navController = navController)
        }

        composable(Screens.HomeScreen.name) {
            HomeScreen(navController = navController)
        }
    }
}