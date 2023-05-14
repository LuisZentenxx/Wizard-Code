package com.example.wizardcode.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.input.key.Key.Companion.Home
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.wizardcode.screens.MascotaSplashScreen
import com.example.wizardcode.screens.home.MascotaHomeScreen
import com.example.wizardcode.screens.login.MascotaLoginScreen

@Composable
fun MascotaNavigation(){

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = MascotaScreens.SplashScreen.name
    ) {
        composable(MascotaScreens.SplashScreen.name) {
            MascotaSplashScreen(navController = navController)
        }

        composable(MascotaScreens.LoginScreen.name){
            MascotaLoginScreen(navController = navController)
        }

        composable(MascotaScreens.MascotaHomeScreen.name) {
            MascotaHomeScreen(navController = navController)
        }
    }
}