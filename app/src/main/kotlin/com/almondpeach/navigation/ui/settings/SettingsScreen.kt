package com.almondpeach.navigation.ui.settings

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.almondpeach.navigation.R
import com.almondpeach.navigation.ui.core.DevicePreviews

@Composable
fun SettingsScreen() {
    Icon(
        imageVector = Icons.Filled.Settings,
        contentDescription = stringResource(R.string.settings),
        modifier = Modifier.fillMaxSize(),
    )
}

@DevicePreviews
@Composable
private fun SettingsScreenPreview() {
    SettingsScreen()
}
