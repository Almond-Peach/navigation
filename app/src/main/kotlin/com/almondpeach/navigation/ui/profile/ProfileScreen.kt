package com.almondpeach.navigation.ui.profile

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.almondpeach.navigation.R
import com.almondpeach.navigation.ui.core.DevicePreviews

@Composable
fun ProfileScreen() {
    Icon(
        imageVector = Icons.Filled.Person,
        contentDescription = stringResource(R.string.profile),
        modifier = Modifier.fillMaxSize(),
    )
}

@DevicePreviews
@Composable
private fun ProfileScreenPreview() {
    ProfileScreen()
}
