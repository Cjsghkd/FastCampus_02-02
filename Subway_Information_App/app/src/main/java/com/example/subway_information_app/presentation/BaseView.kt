package com.example.subway_information_app.presentation

interface BaseView<PresenterT: BasePresenter> {
    val presenter: PresenterT
}