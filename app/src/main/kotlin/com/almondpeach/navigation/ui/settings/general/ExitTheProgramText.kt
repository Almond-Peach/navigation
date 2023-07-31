package com.almondpeach.navigation.ui.settings.general

import android.app.Activity
import androidx.compose.foundation.clickable
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.sp
import com.almondpeach.navigation.R
import com.almondpeach.navigation.ui.core.DevicePreviews

@Composable
fun ExitTheProgramText() {
    var openDialog by remember { mutableStateOf(false) }

    Text(
        text = stringResource(R.string.exit),
        modifier = Modifier.clickable { openDialog = true },
        fontSize = 40.sp,
        textDecoration = TextDecoration.Underline,
    )

    if (openDialog.not()) return

    val activity = (LocalContext.current as? Activity)

    AlertDialog(
        onDismissRequest = { openDialog = false },
        title = { Text(text = stringResource(R.string.exit_dialog_title)) },
        text = { Text(text = stringResource(R.string.exit_dialog_text)) },
        confirmButton = {
            Button(onClick = { activity?.finish() }) {
                Text(text = stringResource(R.string.exit_dialog_confirm_text))
            }
        },
        dismissButton = {
            Button(onClick = { openDialog = false }) {
                Text(text = stringResource(R.string.exit_dialog_dismiss_text))
            }
        },
    )
}

@DevicePreviews
@Composable
private fun ExitTheProgramTextPreview() {
    ExitTheProgramText()
}
