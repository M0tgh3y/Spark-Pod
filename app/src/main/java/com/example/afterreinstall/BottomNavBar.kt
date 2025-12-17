package com.example.afterreinstall

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ListAlt
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Icon



data class BottomNavItem(
    val icon: ImageVector,
    val route: String
)

@Composable
fun BottomBar(navController: NavHostController) {

    val items = listOf(
        BottomNavItem( Icons.Default.Home, Screen.Home.route),
        BottomNavItem(Icons.Default.Check, Screen.Test.route),
        BottomNavItem(Icons.AutoMirrored.Filled.ListAlt, Screen.List.route),
        BottomNavItem(Icons.Default.Settings, Screen.Settings.route)
    )

    NavigationBar {
        val navBackStackEntry = navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry.value?.destination?.route

        items.forEach { item ->
            NavigationBarItem(
                icon = { Icon(item.icon, contentDescription = item.route) },
                selected = currentRoute == item.route,
                onClick = {
                    navController.navigate(item.route) {
                        launchSingleTop = true
                        restoreState = true
                        popUpTo(Screen.Home.route)
                    }
                }
            )
        }
    }
}