package com.example.onlineshoppingapp.domain

import com.example.onlineshoppingapp.data.entity.product.ProductEntity
import com.example.onlineshoppingapp.data.repository.ProductRepository

internal class GetProductItemUseCase(
    private val productRepository: ProductRepository
): UseCase {
    suspend operator fun invoke(productId: Long): ProductEntity? {
        return productRepository.getProductItem(productId)
    }
}