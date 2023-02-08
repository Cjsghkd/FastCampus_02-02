package com.example.moviereviewapp.data.repository

import com.example.moviereviewapp.data.api.MovieApi
import com.example.moviereviewapp.domain.model.Movie
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext

class MovieRepositoryImpl(
    private val movieApi: MovieApi,
    private val dispatcher: CoroutineDispatcher
): MovieRepository {
    override suspend fun getAllMovies(): List<Movie> = withContext(dispatcher) {
        movieApi.getAllMovies()
    }
}