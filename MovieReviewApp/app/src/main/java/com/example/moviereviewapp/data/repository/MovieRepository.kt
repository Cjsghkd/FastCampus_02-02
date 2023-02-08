package com.example.moviereviewapp.data.repository

import com.example.moviereviewapp.domain.model.Movie

interface MovieRepository {
    suspend fun getAllMovies(): List<Movie>
}