package com.almondpeach.navigation.ui.core.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.almondpeach.navigation.ui.core.previews.DevicePreviews

@Composable
fun TextButton(
    text: String,
    onClick: () -> Unit = { },
) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .padding(horizontal = 20.dp)
            .fillMaxWidth(),
    ) {
        Text(
            text = text,
            fontSize = 30.sp,
        )
    }
}

@DevicePreviews
@Composable
private fun NavToScreenButtonPreview() {
    TextButton(text = "")
}
