package com.example.shop.model

import com.google.gson.annotations.SerializedName

data class ShopItem (
    @SerializedName("id") val id: Int,
    @SerializedName("title") val title: String,
    @SerializedName("price") val price: String,
    @SerializedName("category") val category: String,
    @SerializedName("description") val description: String,
    @SerializedName("image") val image: String
)