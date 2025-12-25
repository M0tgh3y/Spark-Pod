package com.example.afterreinstall


import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController


data class BottomNavItem(
    val icon: ImageVector,
    val route: String
)

@Composable
fun BottomBar(navController: NavHostController) {


    val items = listOf(
        BottomNavItem( Icons.Default.Home, Screen.Home.route),
        BottomNavItem(Icons.Default.Android, Screen.Test.route),
        BottomNavItem(Icons.AutoMirrored.Filled.ListAlt, Screen.List.route),
        BottomNavItem(Icons.Default.Settings, Screen.Settings.route)
    )

    Surface(
        shape = RoundedCornerShape(30.dp),
        color = Color(0xFFACD4D5),
        modifier = Modifier
            .height(100.dp)
            .padding(25.dp)
    ) {
        NavigationBar(containerColor = Color.Transparent) {
            val navBackStackEntry = navController.currentBackStackEntryAsState()
            val currentRoute = navBackStackEntry.value?.destination?.route

            items.forEach { item ->
                NavigationBarItem(
                    icon = { Icon(
                        item.icon,
                        contentDescription = item.route,
                        modifier = Modifier
                            .size(30.dp)) },
                    selected = currentRoute == item.route,
                    onClick = {
                        navController.navigate(item.route) {
                            launchSingleTop = true
                            restoreState = true
                            popUpTo(Screen.Home.route)
                        }
                    },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color(0xFF1981C1),
                        unselectedIconColor = Color.Black,
                        indicatorColor = Color.Transparent
                    )
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BottomBarPre() {
    val navController = rememberNavController()

    BottomBar(navController = navController)
}