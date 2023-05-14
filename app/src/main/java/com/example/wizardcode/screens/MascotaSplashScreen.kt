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
import com.example.wizardcode.navigation.MascotaScreens
import kotlinx.coroutines.delay

@Composable
fun MascotaSplashScreen(navController: NavController) {
    LaunchedEffect(key1 = true) {
        delay(2000L)
        navController.navigate(MascotaScreens.LoginScreen.name)
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
