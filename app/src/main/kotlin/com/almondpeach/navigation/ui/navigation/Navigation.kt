package com.almondpeach.navigation.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.almondpeach.navigation.ui.screens.home.HomeScreen
import com.almondpeach.navigation.ui.screens.profile.ProfileScreen
import com.almondpeach.navigation.ui.screens.settings.SettingsScreen

@Composable
fun Navigation(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,
    ) {
        composable(Screen.Home.route) {
            HomeScreen()
        }

        composable(Screen.Profile.route) {
            ProfileScreen()
        }

        composable(Screen.Settings.route) {
            SettingsScreen(navController = navController)
        }
    }
}

sealed class Screen(val route: String) {
    data object Home : Screen("home")
    data object Profile : Screen("profile")
    data object Settings : Screen("settings")
}
