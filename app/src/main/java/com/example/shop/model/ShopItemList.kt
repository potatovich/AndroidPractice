package com.example.shop.model

import androidx.compose.runtime.State
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import java.io.IOException

class ShopItemList(private val shopItemUseCase: ShopItemUseCase) : ViewModel() {
    private val _siList = mutableStateOf<List<ShopItem>>(emptyList())
    val siList: State<List<ShopItem>> = _siList

    init {
        loadShopItems()
    }

    private fun loadShopItems() {
        viewModelScope.launch {
            try {
                val items = shopItemUseCase(
                    id = null,
                    title = null,
                    price = null,
                    category = null,
                    description = null,
                    image = null)
                _siList.value = items
            } catch (networkException: IOException) {
                println("Network error: ${networkException.localizedMessage}")
                _siList.value = emptyList()
            } catch (someException: Exception) {
                println("Error: ${someException.localizedMessage}")
                _siList.value = emptyList()
            }
        }
    }
}