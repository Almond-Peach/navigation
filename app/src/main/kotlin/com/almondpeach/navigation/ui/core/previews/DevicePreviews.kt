package com.almondpeach.navigation.ui.core.previews

import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview

@Preview(
    name = "portrait",
    showBackground = true,
    device = Devices.PHONE,
)
@Preview(
    name = "landscape",
    widthDp = 1024,
    heightDp = 720,
    showBackground = true,
    device = Devices.AUTOMOTIVE_1024p,
)
annotation class DevicePreviews
