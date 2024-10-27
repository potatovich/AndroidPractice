package com.example.shop.bottom.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.shop.model.ShopItemList
import com.example.shop.screens.Details
import com.example.shop.screens.Favourites
import com.example.shop.screens.Home
import com.example.shop.screens.Notifications
import com.example.shop.screens.ShopItemDetails

@Composable
fun NavGraph(navHostController: NavHostController, shopItemList: ShopItemList) {

    NavHost(navController = navHostController, startDestination = "details") {
        composable("home") { Home() }
        composable("details") { Details(navController = navHostController, shopItemList = shopItemList) }
        composable("favourites") { Favourites() }
        composable("notifications") { Notifications() }
        composable ("shopItemDetails/{id}") { backStackEntry ->
            val id = backStackEntry.arguments?.getString("id")?.toInt() ?: 0
            ShopItemDetails(id = id, shopItemList = shopItemList)
        }
    }
}