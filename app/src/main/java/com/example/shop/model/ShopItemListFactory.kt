package com.example.shop.model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ShopItemListFactory(
    private val shopItemUseCase: ShopItemUseCase
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ShopItemList::class.java)) {
            return ShopItemList(shopItemUseCase) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}