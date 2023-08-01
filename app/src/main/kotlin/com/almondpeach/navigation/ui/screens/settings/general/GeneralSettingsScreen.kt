package com.almondpeach.navigation.ui.screens.settings.general

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.almondpeach.navigation.R
import com.almondpeach.navigation.ui.core.components.ExitTheProgramDialogText
import com.almondpeach.navigation.ui.core.components.NavToScreenButton
import com.almondpeach.navigation.ui.core.previews.DevicePreviews
import com.almondpeach.navigation.ui.navigation.RootScreen
import com.almondpeach.navigation.ui.navigation.SettingsScreen

@Composable
fun GeneralSettingsScreen(
    rootNavController: NavController,
    settingsNavController: NavController,
) {
    var openExitDialog by rememberSaveable { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(20.dp, alignment = Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        NavToScreenButton(
            navController = settingsNavController,
            route = SettingsScreen.AccountSettings.route,
            text = stringResource(R.string.nav_to_account_settings),
        ) {
            launchSingleTop = true
        }
        NavToScreenButton(
            navController = rootNavController,
            route = RootScreen.Home.route,
            text = stringResource(R.string.nav_to_home_tab),
        ) {
            popUpTo(RootScreen.Home.route) {
                inclusive = true
            }
        }
        ExitTheProgramDialogText(
            openDialog = openExitDialog,
            onOpenDialogChange = { openExitDialog = it },
        )
    }
}

@DevicePreviews
@Composable
private fun GeneralSettingsScreenPreview() {
    GeneralSettingsScreen(
        rootNavController = rememberNavController(),
        settingsNavController = rememberNavController(),
    )
}
