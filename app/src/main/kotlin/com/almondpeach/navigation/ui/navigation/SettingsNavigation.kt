package com.almondpeach.navigation.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.almondpeach.navigation.ui.screens.settings.account.AccountSettingsScreen
import com.almondpeach.navigation.ui.screens.settings.general.GeneralSettingsScreen

@Composable
fun SettingsNavigation(
    onNavHome: () -> Unit,
) {
    val settingsNavController = rememberNavController()

    NavHost(
        navController = settingsNavController,
        startDestination = SettingsScreen.GeneralSettings.route,
    ) {
        composable(SettingsScreen.GeneralSettings.route) {
            GeneralSettingsScreen(
                onNavHome = onNavHome,
                onNavAccountSettings = {
                    settingsNavController.navigate(SettingsScreen.AccountSettings.route) {
                        launchSingleTop = true
                    }
                },
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
