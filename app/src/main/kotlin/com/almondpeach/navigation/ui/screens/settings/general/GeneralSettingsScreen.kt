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
import com.almondpeach.navigation.R
import com.almondpeach.navigation.ui.core.components.ExitTheProgramDialogText
import com.almondpeach.navigation.ui.core.components.TextButton
import com.almondpeach.navigation.ui.core.previews.DevicePreviews

@Composable
fun GeneralSettingsScreen(
    onNavHome: () -> Unit = { },
    onNavAccountSettings: () -> Unit = { },
) {
    var openExitDialog by rememberSaveable { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(20.dp, alignment = Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        TextButton(text = stringResource(R.string.nav_to_account_settings)) { onNavAccountSettings() }
        TextButton(text = stringResource(R.string.nav_to_home_tab)) { onNavHome() }
        ExitTheProgramDialogText(
            openDialog = openExitDialog,
            onOpenDialogChange = { openExitDialog = it },
        )
    }
}

@DevicePreviews
@Composable
private fun GeneralSettingsScreenPreview() {
    GeneralSettingsScreen()
}
