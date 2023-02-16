package com.example.moviereviewapp.presentation.reviews

import com.example.moviereviewapp.domain.model.Movie
import com.example.moviereviewapp.domain.model.Review
import com.example.moviereviewapp.presentation.BaseView
import com.example.moviereviewapp.presentation.BasePresenter

interface MovieReviewsContract {

    interface View : BaseView<Presenter> {

        fun showLoadingIndicator()

        fun hideLoadingIndicator()

        fun showErrorDescription(message: String)

        fun showMovieInformation(movie: Movie)

        fun showReviews(reviews: List<Review>)
    }

    interface Presenter : BasePresenter {
        val movie: Movie
    }
}