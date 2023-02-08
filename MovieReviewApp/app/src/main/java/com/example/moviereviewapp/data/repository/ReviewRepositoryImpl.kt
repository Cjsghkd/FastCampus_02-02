package com.example.moviereviewapp.data.repository

import com.example.moviereviewapp.data.api.ReviewApi
import com.example.moviereviewapp.domain.model.Review
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext

class ReviewRepositoryImpl(
    private val reviewApi: ReviewApi,
    private val dispatcher: CoroutineDispatcher
): ReviewRepository {
    override suspend fun getLatestReview(movieId: String): Review? = withContext(dispatcher) {
        reviewApi.getLatestReview(movieId)
    }
}