package com.example.fooddeliveryapp.data.entity

import android.os.Parcelable
import com.example.fooddeliveryapp.screen.main.home.restaurant.RestaurantCategory
import kotlinx.parcelize.Parcelize


@Parcelize
data class RestaurantEntity(
    override val id: Long,
    val restaurantInfoId: Long,
    val restaurantCategory: RestaurantCategory,
    val restaurantTitle: String,
    val restaurantImageUrl: String,
    val grade: Float,
    val reviewCount: Int,
    val deliveryTimeRange: Pair<Int, Int>,
    val deliveryTipRange: Pair<Int, Int>
): Entity, Parcelable