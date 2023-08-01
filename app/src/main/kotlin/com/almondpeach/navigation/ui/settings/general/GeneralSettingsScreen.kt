package com.almondpeach.navigation.ui.settings.general

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.almondpeach.navigation.R
import com.almondpeach.navigation.ui.core.DevicePreviews
import com.almondpeach.navigation.ui.navigation.Screen
import com.almondpeach.navigation.ui.settings.SettingsScreen

@Composable
fun GeneralSettingsScreen(
    navController: NavController,
    nestedNavController: NavController,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(20.dp, alignment = Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        NavToScreenButton(
            navController = nestedNavController,
            route = SettingsScreen.AccountSettings.route,
            text = stringResource(R.string.nav_to_account_settings),
        ) {
            launchSingleTop = true
        }
        NavToScreenButton(
            navController = navController,
            route = Screen.Home.route,
            text = stringResource(R.string.nav_to_home_tab),
        ) {
            popUpTo(Screen.Home.route) {
                inclusive = true
            }
        }
        ExitTheProgramText()
    }
}

@DevicePreviews
@Composable
private fun GeneralSettingsScreenPreview() {
    GeneralSettingsScreen(
        navController = rememberNavController(),
        nestedNavController = rememberNavController(),
    )
}
