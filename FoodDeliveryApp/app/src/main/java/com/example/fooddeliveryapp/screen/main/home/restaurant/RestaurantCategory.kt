package com.example.fooddeliveryapp.screen.main.home.restaurant

import androidx.annotation.StringRes
import com.example.fooddeliveryapp.R
import kotlinx.coroutines.CoroutineExceptionHandler

enum class RestaurantCategory(
    @StringRes val categoryNameId: Int,
    @StringRes val categoryTypeId: Int
) {
    ALL(R.string.all, R.string.all_type)
}