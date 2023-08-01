package com.almondpeach.navigation.ui.screens.settings

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.almondpeach.navigation.ui.core.previews.DevicePreviews
import com.almondpeach.navigation.ui.screens.settings.account.AccountSettingsScreen
import com.almondpeach.navigation.ui.screens.settings.general.GeneralSettingsScreen

@Composable
fun SettingsScreen(
    navController: NavController,
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
    SettingsScreen(
        navController = rememberNavController(),
    )
}
