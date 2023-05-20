package com.example.wizardcode.screens.learn

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.wizardcode.R

@Composable
fun JetpackComposeScreen(navController: NavController){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.jet_background),
            contentDescription = "background",
            modifier = Modifier.fillMaxSize(), // Aquí se utiliza el Modifier.fillMaxSize()
            contentScale = ContentScale.FillBounds
        )

        LazyColumn(){

        }
    }

}