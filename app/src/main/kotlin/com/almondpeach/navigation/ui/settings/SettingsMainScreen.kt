package com.almondpeach.navigation.ui.settings

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.almondpeach.navigation.ui.core.DevicePreviews

@Composable
fun SettingsMainScreen(
    navController: NavHostController,
) {
    val nestedNavController = rememberNavController()

    NavHost(
        navController = nestedNavController,
        startDestination = SettingsScreen.GeneralSettings.route,
    ) {
        composable(SettingsScreen.GeneralSettings.route) {
            GeneralSettingsScreen(
                navController = navController,
                nestedNavController = nestedNavController,
            )
        }

        composable(SettingsScreen.AccountSettings.route) {
            AccountSettingsScreen()
        }
    }
}

sealed class SettingsScreen(val route: String) {
    data object GeneralSettings : SettingsScreen("general")
    data object AccountSettings : SettingsScreen("account")
}

@DevicePreviews
@Composable
private fun SettingsMainScreenPreview() {
    SettingsMainScreen(rememberNavController())
}
