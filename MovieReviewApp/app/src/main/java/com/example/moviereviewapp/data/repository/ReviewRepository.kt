package com.example.moviereviewapp.data.repository

import com.example.moviereviewapp.domain.model.Review

interface ReviewRepository {
    suspend fun getLatestReview(movieId: String): Review?

    suspend fun getAllMovieReviews(movieId: String): List<Review>
}