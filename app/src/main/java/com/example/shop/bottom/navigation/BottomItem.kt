package com.example.shop.bottom.navigation

import com.example.shop.R

sealed class BottomItem(val title: String, val iconId: Int, val route: String) {
    data object Home: BottomItem("Домашняя страница", R.drawable.home, "home")
    data object Details: BottomItem("Список", R.drawable.details, "details")
    data object Favourites: BottomItem("Избранное", R.drawable.favorites, "favourites")
    data object Notifications: BottomItem("Уведомления", R.drawable.notifications, "notifications")
}