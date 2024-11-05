package com.example.shop.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetroFit {
    private const val fakeStoreApiUrl = "https://fakestoreapi.com/"

    val api: ShopApi by lazy {
        Retrofit.Builder()
            .baseUrl(fakeStoreApiUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ShopApi::class.java)
    }
}