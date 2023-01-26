package com.example.onlineshoppingapp.data.entity.product

import java.util.*

data class ProductEntity(
    val id: Long,
    val createAt: Date,
    val productName: String,
    val productPrice: Int,
    val productImage: String,
    val productType: String,
    val productIntroductionImage: String
)
