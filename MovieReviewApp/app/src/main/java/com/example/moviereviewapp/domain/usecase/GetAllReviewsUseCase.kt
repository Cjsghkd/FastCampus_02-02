package com.example.moviereviewapp.domain.usecase

import com.example.moviereviewapp.data.repository.ReviewRepository
import com.example.moviereviewapp.domain.model.Review

class GetAllReviewsUseCase(private val reviewRepository: ReviewRepository) {
    suspend operator fun invoke(movieId: String): List<Review> =
        reviewRepository.getAllReviews(movieId)
}