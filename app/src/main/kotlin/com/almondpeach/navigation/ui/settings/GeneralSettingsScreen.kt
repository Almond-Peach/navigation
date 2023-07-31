package com.almondpeach.navigation.ui.settings

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.almondpeach.navigation.R
import com.almondpeach.navigation.ui.core.DevicePreviews

@Composable
fun GeneralSettingsScreen(
    navController: NavController,
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Button(
            onClick = {
                navController.navigate(SettingsScreen.AccountSettings.route) {
                    launchSingleTop = true
                }
            },
            modifier = Modifier
                .padding(horizontal = 20.dp)
                .fillMaxWidth(),
        ) {
            Text(text = stringResource(R.string.nav_to_account_settings))
        }
    }
}

@DevicePreviews
@Composable
private fun GeneralSettingsScreenPreview() {
    GeneralSettingsScreen(rememberNavController())
}
