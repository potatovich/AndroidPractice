package com.example.shop.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.shop.model.ShopItemList

@Composable
fun ShopItemDetails(id: Int, shopItemList: ShopItemList) {
    val items = shopItemList.siList.value
    val item = items.getOrNull(id)

    if (item != null) {
        Column(modifier = Modifier.padding(top = 50.dp, start = 16.dp, end = 16.dp)) {
            Text(text = "Наименование товара: ${item.title}")
            Text(text = "Цена: ${item.price}")
            Text(text = "Категория товара: ${item.category}")
            Text(text = "Описание: ${item.description}")
            Image(
                painter = rememberAsyncImagePainter(model = item.image),
                contentDescription = null,
                modifier = Modifier
                    .height(150.dp)
                    .padding(top = 8.dp),
                contentScale = ContentScale.Crop)
        }
    }
}