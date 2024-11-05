package com.example.shop.api

import com.example.shop.model.ShopItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.IOException

class ShopItemContainer(private val api: ShopApi) {

    suspend fun getShopItems(
        id: String?,
        title: String?,
        price: String?,
        category: String?,
        description: String?,
        image: String?): List<ShopItem> {

        return withContext(Dispatchers.IO) {
            try {
                val shopItemsList = api.getShopItems(id, title, price, category, description, image)
                shopItemsList.map { it ->
                    ShopItem(
                        id = it.id,
                        title = it.title,
                        price = it.price,
                        category = it.category,
                        description = it.description,
                        image = it.image
                    )
                }
            } catch (networkException: IOException) {
                println("Network error: ${networkException.localizedMessage}")
                emptyList()
            } catch (someException: Exception) {
                println("Error: ${someException.localizedMessage}")
                emptyList()
            }!!
        }
    }
}