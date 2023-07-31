package com.almondpeach.navigation.ui.navigation

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun NavBar(
    items: List<NavBarItem>,
    navController: NavController,
    onItemClick: (NavBarItem) -> Unit,
) {
    val backStackEntry = navController.currentBackStackEntryAsState()

    NavigationBar {
        items.forEach {
            NavigationBarItem(
                selected = it.route == backStackEntry.value?.destination?.route,
                onClick = { onItemClick(it) },
                label = {
                    Text(
                        text = it.name,
                        textAlign = TextAlign.Center,
                    )
                },
                icon = {
                    Icon(
                        imageVector = it.icon,
                        contentDescription = it.name,
                    )
                },
            )
        }
    }
}

data class NavBarItem(
    val name: String,
    val route: String,
    val icon: ImageVector,
)
