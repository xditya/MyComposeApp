package me.xditya.mycomposeapp.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun CustomBottomAppBar(
    navController: NavController
) {
    BottomAppBar(
        actions = {
            IconButton(onClick = {
                navController.navigate("home")
            }) {
                Icon(
                    Icons.Filled.Home,
                    contentDescription = "Home"
                )
            }
            IconButton(
                onClick = {
                    navController.navigate("info")
                },
            ) {
                Icon(
                    Icons.Filled.Info,
                    contentDescription = "Info"
                )
            }
        },
    )
}