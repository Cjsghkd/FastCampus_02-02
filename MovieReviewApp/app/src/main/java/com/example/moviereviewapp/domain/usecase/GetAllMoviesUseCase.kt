package com.example.moviereviewapp.domain.usecase

import com.example.moviereviewapp.data.repository.MovieRepository
import com.example.moviereviewapp.domain.model.Movie

class GetAllMoviesUseCase(private val movieRepository: MovieRepository) {
    suspend operator fun invoke(): List<Movie> = movieRepository.getAllMovies()
}