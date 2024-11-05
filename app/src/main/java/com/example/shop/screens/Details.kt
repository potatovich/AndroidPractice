package com.example.shop.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.shop.model.ShopItemList

@Composable
fun Details(navController: NavHostController, shopItemList: ShopItemList) {
    val shopItems = shopItemList.siList.value

    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .padding(30.dp)){

        items(shopItems.size) { id ->
            val item = shopItems[id]
            Box(
                modifier = Modifier
                    .height(100.dp)
                    .fillMaxWidth()
                    .background(color = Color.LightGray)
                    .clickable {
                        navController.navigate("shopItemDetails/$id")
                    }
                    .padding(bottom = 20.dp)
            ){
                Text(
                    text = item.title,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(15.dp)
                )
            }
            Spacer(modifier = Modifier.size(8.dp))
        }
    }
}