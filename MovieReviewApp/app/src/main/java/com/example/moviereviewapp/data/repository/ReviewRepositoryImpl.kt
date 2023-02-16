package com.example.moviereviewapp.data.repository

import com.example.moviereviewapp.data.api.ReviewApi
import com.example.moviereviewapp.domain.model.Review
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext

class ReviewRepositoryImpl(
    private val reviewApi: ReviewApi,
    private val dispatchers: CoroutineDispatcher
): ReviewRepository {
    override suspend fun getLatestReview(movieId: String): Review? = withContext(dispatchers) {
        reviewApi.getLatestReview(movieId)
    }

    override suspend fun getAllMovieReviews(movieId: String): List<Review> = withContext(dispatchers) {
        reviewApi.getAllMovieReviews(movieId)
    }
}