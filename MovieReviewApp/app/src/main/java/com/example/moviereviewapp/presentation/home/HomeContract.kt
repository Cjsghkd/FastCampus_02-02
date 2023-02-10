package com.example.moviereviewapp.presentation.home

import com.example.moviereviewapp.domain.model.FeaturedMovie
import com.example.moviereviewapp.domain.model.Movie
import com.example.moviereviewapp.presentation.BasePresenter
import com.example.moviereviewapp.presentation.BaseView

interface HomeContract {

    interface View: BaseView<Presenter> {

        fun showLoadingIndicator()

        fun hideLoadingIndicator()

        fun showErrorDescription(message: String)

        fun showMovies(
            featuredMovie: FeaturedMovie?,
            movies: List<Movie>
        )
    }

    interface Presenter: BasePresenter
}