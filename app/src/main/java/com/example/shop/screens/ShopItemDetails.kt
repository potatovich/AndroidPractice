package com.example.shop.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.shop.model.ShopItemList

@Composable
fun ShopItemDetails(id: Int, shopItemList: ShopItemList) {
    val item = shopItemList.shopItems[id]

    Column(modifier = Modifier.padding(top = 50.dp, start = 16.dp, end = 16.dp)) {
        Text(text = item.title)
        Text(text = item.price)
        Text(text = item.description)
    }
}