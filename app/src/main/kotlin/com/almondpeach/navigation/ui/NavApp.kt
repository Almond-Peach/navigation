package com.almondpeach.navigation.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.rememberNavController
import com.almondpeach.navigation.R
import com.almondpeach.navigation.ui.core.previews.DevicePreviews
import com.almondpeach.navigation.ui.navigation.NavBar
import com.almondpeach.navigation.ui.navigation.NavBarItem
import com.almondpeach.navigation.ui.navigation.Navigation
import com.almondpeach.navigation.ui.navigation.Screen

@Composable
fun NavApp() = MaterialTheme {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            NavBar(
                items = listOf(
                    NavBarItem(
                        name = stringResource(R.string.dest_home),
                        route = Screen.Home.route,
                        icon = Icons.Filled.Home,
                    ),
                    NavBarItem(
                        name = stringResource(R.string.dest_profile),
                        route = Screen.Profile.route,
                        icon = Icons.Filled.Person,
                    ),
                    NavBarItem(
                        name = stringResource(R.string.dest_settings),
                        route = Screen.Settings.route,
                        icon = Icons.Filled.Settings,
                    ),
                ),
                navController = navController,
                onItemClick = {
                    navController.navigate(it.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
            )
        },
    ) {
        Box(
            modifier = Modifier
                .padding(it)
                .fillMaxSize(),
        ) {
            Navigation(navController = navController)
        }
    }
}

@DevicePreviews
@Composable
private fun NavAppPreview() {
    NavApp()
}
