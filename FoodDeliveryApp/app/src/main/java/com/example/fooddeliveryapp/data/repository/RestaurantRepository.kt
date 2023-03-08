package com.example.fooddeliveryapp.data.repository

import com.example.fooddeliveryapp.data.entity.RestaurantEntity
import com.example.fooddeliveryapp.screen.main.home.restaurant.RestaurantCategory

interface RestaurantRepository {
    suspend fun getList(
        restaurantCategory: RestaurantCategory
    ): List<RestaurantEntity>
}