package com.example.subway_information_app.presenter

interface BaseView<PresenterT: BasePresenter> {
    val presenter: PresenterT
}