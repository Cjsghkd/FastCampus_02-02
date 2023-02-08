package com.example.moviereviewapp.domain.model

data class FeaturedMovie(
    val movie: Movie,
    val latestReview: Review?
)
