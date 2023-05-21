package com.example.wizardcode.screens.learn

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.wizardcode.R

@Composable
fun PythonScreen(navController: NavController) {
    val moduleListPy = listOf(
        "Introducción a Python",
        "Variables y tipos de datos",
        "Condicionales (If - Elif - Else)",
        "Bucles (For - While)",
        "Funciones y Módulos",
        "Listas y Tuplas",
        "Diccionarios",
        "Manejo de excepciones (Try - except)",
        "Introduccion POO",

        // Agrega aquí más módulos según sea necesario
    )

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.py_background),
            contentDescription = "background",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            items(moduleListPy) { module ->
                ModuleItemPy(module = module)
            }
        }
    }
}

@Composable
fun ModuleItemPy(module: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = module,
                style = TextStyle(fontSize = 16.sp),
                fontWeight = FontWeight.Bold
            )
            // Agrega aquí el contenido adicional del módulo, como descripción, imágenes, etc.
        }
    }
}
