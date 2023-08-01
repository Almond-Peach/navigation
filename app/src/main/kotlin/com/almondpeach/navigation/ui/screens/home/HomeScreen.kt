package com.almondpeach.navigation.ui.screens.home

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.almondpeach.navigation.R
import com.almondpeach.navigation.ui.core.previews.DevicePreviews

@Composable
fun HomeScreen() {
    Icon(
        imageVector = Icons.Filled.Home,
        contentDescription = stringResource(R.string.home),
        modifier = Modifier.fillMaxSize(),
    )
}

@DevicePreviews
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}
