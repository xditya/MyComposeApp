package me.xditya.mycomposeapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import me.xditya.mycomposeapp.ui.screens.HomeScreen
import me.xditya.mycomposeapp.ui.screens.InfoScreen

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(navController)
        }
        composable("info") {
            InfoScreen(navController)
        }
    }
}