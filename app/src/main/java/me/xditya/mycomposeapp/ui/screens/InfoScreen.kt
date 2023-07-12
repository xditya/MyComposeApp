package me.xditya.mycomposeapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import me.xditya.mycomposeapp.R
import me.xditya.mycomposeapp.navigation.CustomBottomAppBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InfoScreen(
    navController: NavController
) {
    Scaffold(
        bottomBar = {
            CustomBottomAppBar(navController = navController)
        }
    ) {
        Surface(
            modifier = Modifier.padding(it)
        ) {
            Column {

            }
            Image(
                painter = painterResource(id = R.drawable.avatar), contentDescription = "somepic",
            )
        }
    }
}