package com.example.wizardcode.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.wizardcode.R
import com.example.wizardcode.navigation.Screens
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.delay
/*
    *@Autor -> Luis Zenteno Mardones
    * LaunchedEffect -> Función que ejecuta un efecto solo una vez cuando el composable es creado o recomponido.
    * Delay -> Retrasa la navegacion hacia la pantalla de Login despúes de 2s.
    * Navigate -> Realiza la navegación hacia la pantalla de Login.
    *  */
@Composable
fun SplashScreen(navController: NavController) {

    LaunchedEffect(key1 = true) {
        delay(2000L)
        navController.navigate(Screens.LoginScreen.name)

       /* EN PROCESO
       ----------------------------------------------
        Realiza una comprobacion sobre el estado de autenticación del usuario actual en Firebase.
        Si el usuario ya esta logeado, directamente navega hacia el HomeScreen.*/

        if(FirebaseAuth.getInstance().currentUser?.email.isNullOrEmpty()) {
            navController.navigate(Screens.LoginScreen.name)
        }
        else {
            navController.navigate(Screens.HomeScreen.name) {
                popUpTo(Screens.SplashScreen.name) {
                    inclusive = true
                }
            }
        }


    }

    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            "Wizard Code",
            style = MaterialTheme.typography.bodyMedium)

        Image(painter = painterResource(id = R.drawable.logo), contentDescription = null)
    }

}
