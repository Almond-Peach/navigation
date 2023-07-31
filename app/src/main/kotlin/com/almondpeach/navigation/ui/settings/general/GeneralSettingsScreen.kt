package com.almondpeach.navigation.ui.settings.general

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.almondpeach.navigation.ui.core.DevicePreviews

@Composable
fun GeneralSettingsScreen(
    navController: NavController,
    nestedNavController: NavController,
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(20.dp, alignment = Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        NavToAccountSettingsButton(nestedNavController)
        NavToHomeTabButton(navController)
    }
}

@DevicePreviews
@Composable
private fun GeneralSettingsScreenPreview() {
    GeneralSettingsScreen(rememberNavController(), rememberNavController())
}
