package com.example.shop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.ViewModelProvider
import com.example.shop.api.RetroFit
import com.example.shop.api.ShopItemContainer
import com.example.shop.bottom.navigation.MainScreen
import com.example.shop.model.ShopItemList
import com.example.shop.model.ShopItemListFactory
import com.example.shop.model.ShopItemUseCase
import com.example.shop.ui.theme.ListWithDetailsTheme

class MainActivity : ComponentActivity() {
    private lateinit var shopItemList: ShopItemList

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val api = RetroFit.api
        val shopItemContainer = ShopItemContainer(api)
        val useCase = ShopItemUseCase(shopItemContainer)
        val factory = ShopItemListFactory(useCase)
        shopItemList = ViewModelProvider(this, factory)[ShopItemList::class.java]

        setContent {
            ListWithDetailsTheme {
                MainScreen(shopItemList = shopItemList)
            }
        }
    }
}