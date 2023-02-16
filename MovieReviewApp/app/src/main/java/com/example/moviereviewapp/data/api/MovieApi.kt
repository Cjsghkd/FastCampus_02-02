package com.example.moviereviewapp.data.api

import com.example.moviereviewapp.domain.model.Movie

interface MovieApi {
    suspend fun getAllMovies(): List<Movie>

    suspend fun getMovies(movieId: List<String>): List<Movie>
}