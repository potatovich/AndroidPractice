package com.example.shop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.shop.bottom.navigation.MainScreen
import com.example.shop.model.ShopItemList
import com.example.shop.ui.theme.ListWithDetailsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val shopItemList = ShopItemList()
            ListWithDetailsTheme {
                MainScreen(shopItemList = shopItemList)
            }
        }
    }
}