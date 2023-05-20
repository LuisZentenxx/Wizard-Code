package com.example.wizardcode.screens.home


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.wizardcode.R

@Composable
fun HomeScreen(navController: NavController) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = "background",
            modifier = Modifier.fillMaxSize(), // Aquí se utiliza el Modifier.fillMaxSize()
            contentScale = ContentScale.FillBounds
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {

            // CARD JETPACK COMPOSE
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("LEARN JETPACK COMPOSE")
                    Image(
                        painter = painterResource(id = R.drawable.icon_compose),
                        contentDescription = null
                    )
                }
            }

                Spacer(modifier = Modifier.height(15.dp))

                // CARD PYTHON
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text("LEARN PYTHON")
                        Image(
                            painter = painterResource(id = R.drawable.icon_python),
                            contentDescription = null
                        )
                    }
                }

                Spacer(modifier = Modifier.height(15.dp))

                // CARD JAVA
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Text("LEARN JAVA")
                        Image(
                            painter = painterResource(id = R.drawable.icon_java),
                            contentDescription = null
                        )
                    }
                }

                Spacer(modifier = Modifier.height(15.dp))

                // CARD GITHUB
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically)
                    {
                        Text("LEARN GITHUB", fontSize = 20.sp)
                        Spacer(modifier = Modifier.width(20.dp))
                        Image(
                            painter = painterResource(id = R.drawable.icon_git),
                            contentDescription = null,
                            modifier = Modifier.size(80.dp))
                    }
                }

                Spacer(modifier = Modifier.height(15.dp))

                // CARD KOTLIN
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically)
                    {
                        Text("LEARN KOTLIN", fontSize = 20.sp)
                        Spacer(modifier = Modifier.width(20.dp))
                        Image(
                            painter = painterResource(id = R.drawable.icon_compose),
                            contentDescription = null,
                            modifier = Modifier.size(100.dp))
                    }
                }


            }
        }
}