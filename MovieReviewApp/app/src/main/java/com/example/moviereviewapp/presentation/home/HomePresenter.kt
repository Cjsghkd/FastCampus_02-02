package com.example.moviereviewapp.presentation.home

import com.example.moviereviewapp.domain.usecase.GetAllMoviesUseCase
import com.example.moviereviewapp.domain.usecase.GetRandomFeaturedMovieUseCase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

class HomePresenter(
    private val view: HomeContract.View,
    private val getRandomFeaturedMovie: GetRandomFeaturedMovieUseCase,
    private val getAllMovies: GetAllMoviesUseCase
): HomeContract.Presenter {

    override val scope: CoroutineScope = MainScope()

    override fun onViewCreated() {
        fetchMovies()
    }

    override fun onDestroyView() {}

    private fun fetchMovies() = scope.launch {
        try {
            view.showLoadingIndicator()
            val featureMovie = getRandomFeaturedMovie()
            val movies = getAllMovies()
            view.showMovies(featureMovie, movies)
        } catch (exception: Exception) {
            exception.printStackTrace()
            view.showErrorDescription("에러가 발생했어요 😥")
       } finally {
            view.hideLoadingIndicator()
        }
    }
}