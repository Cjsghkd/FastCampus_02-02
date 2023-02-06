package com.example.moviereviewapp.presentation

interface BaseView<PresenterT: BasePresenter> {
    val presenter: PresenterT
}