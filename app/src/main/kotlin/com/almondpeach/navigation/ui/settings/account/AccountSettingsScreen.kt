package com.almondpeach.navigation.ui.settings.account

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ManageAccounts
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.almondpeach.navigation.R
import com.almondpeach.navigation.ui.core.DevicePreviews

@Composable
fun AccountSettingsScreen() {
    Icon(
        imageVector = Icons.Filled.ManageAccounts,
        contentDescription = stringResource(R.string.account_settings),
        modifier = Modifier.fillMaxSize(),
    )
}

@DevicePreviews
@Composable
private fun AccountSettingsScreenPreview() {
    AccountSettingsScreen()
}
