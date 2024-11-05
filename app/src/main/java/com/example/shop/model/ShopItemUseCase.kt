package com.example.shop.model

import com.example.shop.api.ShopItemContainer

class ShopItemUseCase(private val repo: ShopItemContainer) {
    suspend operator fun invoke(
        id: String?,
        title: String?,
        price: String?,
        category: String?,
        description: String?,
        image: String?
    ): List<ShopItem> {
        return repo.getShopItems(
            id,
            title,
            price,
            category,
            description,
            image
        )
    }
}