package com.almondpeach.navigation.ui.settings.general

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavOptionsBuilder
import androidx.navigation.compose.rememberNavController
import com.almondpeach.navigation.ui.core.DevicePreviews

@Composable
fun NavToScreenButton(
    navController: NavController,
    route: String,
    text: String,
    options: NavOptionsBuilder.() -> Unit,
) {
    Button(
        onClick = {
            navController.navigate(route, options)
        },
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
    NavToScreenButton(
        navController = rememberNavController(),
        route = "",
        text = "Screen",
        options = { },
    )
}
