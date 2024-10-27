package com.example.shop.bottom.navigation

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.painterResource
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomNav(navController: NavController) {

    val screens = listOf(
        BottomItem.Home,
        BottomItem.Details,
        BottomItem.Favourites,
        BottomItem.Notifications
    )

    NavigationBar {
        val backStackEntry by navController.currentBackStackEntryAsState()
        val currRoute = backStackEntry?.destination?.route
        screens.forEach { screen ->
            NavigationBarItem(
                selected = currRoute == screen.route,
                onClick = {
                    navController.navigate(screen.route)
                },
                icon = {
                    Icon(
                        painter = painterResource(id = screen.iconId),
                        contentDescription = ""
                    )
                },
                label = {
                    Text(text = screen.title)
                }
            )
        }
    }
}
