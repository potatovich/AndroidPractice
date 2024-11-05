package com.example.shop.api

import com.example.shop.model.ShopItem
import retrofit2.http.GET
import retrofit2.http.Query

interface ShopApi {
    @GET("products")
    suspend fun getShopItems(
        @Query("id") id: String?,
        @Query("title") title: String?,
        @Query("price") price: String?,
        @Query("category") category: String?,
        @Query("description") description: String?,
        @Query("image") image: String?,
    ): List<ShopItem>
}