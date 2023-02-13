package com.example.moviereviewapp.data.api

import com.example.moviereviewapp.domain.model.Review

interface ReviewApi {
    suspend fun getLatestReview(movieId: String): Review?

    suspend fun getAllReviews(movieId: String): List<Review>
}