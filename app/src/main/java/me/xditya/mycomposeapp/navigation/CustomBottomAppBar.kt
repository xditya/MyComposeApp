package me.xditya.mycomposeapp.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController

@Composable
fun CustomBottomAppBar(
    navController: NavController
) {
    val uriHandler = LocalUriHandler.current
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
        floatingActionButton = {
            ExtendedFloatingActionButton(
                text = { Text("Star on GitHub") },
                icon = {
                    Icon(
                        Icons.Outlined.Star, contentDescription = "Star on GitHub"
                    )
                }, onClick = {
                    uriHandler.openUri("https://github.com/xditya/MyComposeApp")
                })
        }
    )
}

@Preview
@Composable
fun GenPrev() {
    CustomBottomAppBar(navController = NavController(LocalContext.current))
}