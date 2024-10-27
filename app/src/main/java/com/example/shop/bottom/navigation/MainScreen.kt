package com.example.shop.bottom.navigation

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.shop.model.ShopItemList

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen(shopItemList: ShopItemList) {
    val navController = rememberNavController()
    Scaffold (
        modifier = Modifier.fillMaxSize(),
        bottomBar = {BottomNav(navController = navController)},
    ) {
        Box(modifier = Modifier.padding(it)) {
            NavGraph(navHostController = navController, shopItemList)
        }
    }
}