package com.example.wizardcode.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.wizardcode.screens.SplashScreen
import com.example.wizardcode.screens.home.HomeScreen
import com.example.wizardcode.screens.learn.GithubScreen
import com.example.wizardcode.screens.learn.JavaScreen
import com.example.wizardcode.screens.learn.JetpackComposeScreen
import com.example.wizardcode.screens.learn.KotlinScreen
import com.example.wizardcode.screens.learn.PythonScreen
import com.example.wizardcode.screens.login.LoginScreen
/*
       * @Autor -> Luis Zenteno Mardones
       * navController -> Objeto que realiza las transacciones entre diferentes destinos
       * NavHost -> Contenedor que se encarga de mostrar los diferentes destinos (Screens)
       * startDestination -> Destino inicial que se muestra al cargar el NavHost
       * NavGraphBuilder -> Permite definir las conexiones entre las pantallas y cómo los usuarios pueden navegar entre ellas,
       * NavBackStackEntry -> Proporciona información y métodos para acceder y modificar el estado de navegación.
       * composable -> Define las diferentes pantallas disponibles dentro del NavHost
*/
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

        composable(Screens.JetpackComposeScreen.name){
            JetpackComposeScreen(navController = navController)
        }

        composable(Screens.PythonScreen.name){
            PythonScreen(navController = navController)
        }

        composable(Screens.JavaScreen.name){
            JavaScreen(navController = navController)
        }

        composable(Screens.GithubScreen.name){
            GithubScreen(navController = navController)
        }

        composable(Screens.KotlinScreen.name){
            KotlinScreen(navController = navController)
        }


    }
}