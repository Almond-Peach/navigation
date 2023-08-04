package com.almondpeach.navigation.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.almondpeach.navigation.ui.screens.home.HomeScreen
import com.almondpeach.navigation.ui.screens.profile.ProfileScreen

@Composable
fun RootNavigation(
    rootNavController: NavHostController,
) {
    NavHost(
        navController = rootNavController,
        startDestination = RootScreen.Home.route,
    ) {
        composable(RootScreen.Home.route) {
            HomeScreen()
        }

        composable(RootScreen.Profile.route) {
            ProfileScreen()
        }

        composable(RootScreen.Settings.route) {
            SettingsNavigation {
                rootNavController.navigate(RootScreen.Home.route) {
                    popUpTo(RootScreen.Home.route) {
                        inclusive = true
                    }
                }
            }
        }
    }
}

sealed class RootScreen(val route: String) {
    data object Home : RootScreen("home")
    data object Profile : RootScreen("profile")
    data object Settings : RootScreen("settings")
}
