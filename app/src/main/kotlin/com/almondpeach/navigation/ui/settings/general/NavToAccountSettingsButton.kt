package com.almondpeach.navigation.ui.settings.general

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.almondpeach.navigation.R
import com.almondpeach.navigation.ui.core.DevicePreviews
import com.almondpeach.navigation.ui.settings.SettingsScreen

@Composable
fun NavToAccountSettingsButton(
    navController: NavController,
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
        Text(
            text = stringResource(R.string.nav_to_account_settings),
            fontSize = 30.sp,
        )
    }
}

@DevicePreviews
@Composable
private fun NavToAccountSettingsButtonPreview() {
    NavToAccountSettingsButton(rememberNavController())
}
