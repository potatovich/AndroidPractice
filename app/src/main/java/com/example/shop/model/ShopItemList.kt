package com.example.shop.model

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList

data class Item(
    val title: String,
    val price: String,
    val description: String,
)

class ShopItemList : ViewModel() {
    private val items = mutableStateListOf(
        Item(
            "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",
            " 109.95",
            "Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday"
        ),

        Item(
            "Mens Casual Premium Slim Fit T-Shirts ",
            "22.3",
            "Slim-fitting style, contrast raglan long sleeve, three-button henley placket, light weight & soft fabric for breathable and comfortable wearing. And Solid stitched shirts with round neck made for durability and a great fit for casual fashion wear and diehard baseball fans. The Henley style round neckline includes a three-button placket."
        ),

        Item(
            "Mens Cotton Jacket",
            "55.99",
            "great outerwear jackets for Spring/Autumn/Winter, suitable for many occasions, such as working, hiking, camping, mountain/rock climbing, cycling, traveling or other outdoors. Good gift choice for you or your family member. A warm hearted love to Father, husband or son in this thanksgiving or Christmas Day."
        ),
        Item (
            "Mens Casual Slim Fit",
            "15.99",
            "The color could be slightly different between on the screen and in practice. / Please note that body builds vary by person, therefore, detailed size information should be reviewed below on the product description."
        ),
        Item (
            "John Hardy Women's Legends Naga Gold & Silver Dragon Station Chain Bracelet",
            "695",
            "From our Legends Collection, the Naga was inspired by the mythical water dragon that protects the ocean's pearl. Wear facing inward to be bestowed with love and abundance, or outward for protection."
        )
    )

    val shopItems: SnapshotStateList<Item> get() = items
}