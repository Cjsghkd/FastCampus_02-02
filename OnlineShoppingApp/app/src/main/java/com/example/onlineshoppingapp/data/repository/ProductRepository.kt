package com.example.onlineshoppingapp.data.repository

import com.example.onlineshoppingapp.data.entity.product.ProductEntity

interface ProductRepository {
    suspend fun getProductList(): List<ProductEntity>
    suspend fun getLocalProductList(): List<ProductEntity>
    suspend fun insertProductItem(ProductItem: ProductEntity): Long
    suspend fun insertProductList(ProductList: List<ProductEntity>)
    suspend fun updateProductItem(ProductItem: ProductEntity)
    suspend fun getProductItem(itemId: Long): ProductEntity?
    suspend fun deleteAll()
    suspend fun deleteProductItem(id: Long)
}