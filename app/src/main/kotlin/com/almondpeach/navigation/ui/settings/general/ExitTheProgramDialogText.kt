package com.almondpeach.navigation.ui.settings.general

import android.app.Activity
import androidx.compose.foundation.clickable
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.sp
import com.almondpeach.navigation.R
import com.almondpeach.navigation.ui.core.DevicePreviews

@Composable
fun ExitTheProgramDialogText(
    openDialog: Boolean,
    onOpenDialogChange: (Boolean) -> Unit,
) {
    Text(
        text = stringResource(R.string.exit),
        modifier = Modifier.clickable { onOpenDialogChange(true) },
        fontSize = 40.sp,
        textDecoration = TextDecoration.Underline,
    )

    if (openDialog.not()) return

    val activity = (LocalContext.current as? Activity)

    AlertDialog(
        onDismissRequest = { onOpenDialogChange(false) },
        title = { Text(text = stringResource(R.string.exit_dialog_title)) },
        text = { Text(text = stringResource(R.string.exit_dialog_text)) },
        confirmButton = {
            Button(onClick = { activity?.finish() }) {
                Text(text = stringResource(R.string.exit_dialog_confirm_text))
            }
        },
        dismissButton = {
            Button(onClick = { onOpenDialogChange(false) }) {
                Text(text = stringResource(R.string.exit_dialog_dismiss_text))
            }
        },
    )
}

@DevicePreviews
@Composable
private fun ExitTheProgramDialogTextHiddenDialogPreview() {
    ExitTheProgramDialogText(
        openDialog = false,
        onOpenDialogChange = { },
    )
}

@DevicePreviews
@Composable
private fun ExitTheProgramDialogTextShownDialogPreview() {
    ExitTheProgramDialogText(
        openDialog = true,
        onOpenDialogChange = { },
    )
}
