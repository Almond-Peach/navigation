package com.almondpeach.navigation.ui.settings

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.almondpeach.navigation.ui.core.DevicePreviews

@Composable
fun SettingsMainScreen() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = SettingsScreen.GeneralSettings.route,
    ) {
        composable(SettingsScreen.GeneralSettings.route) {
            GeneralSettingsScreen(navController)
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
    SettingsMainScreen()
}
