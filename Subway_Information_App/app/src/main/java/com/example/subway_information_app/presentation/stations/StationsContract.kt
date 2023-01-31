package com.example.subway_information_app.presentation.stations

import com.example.subway_information_app.domain.Station
import com.example.subway_information_app.presentation.BasePresenter
import com.example.subway_information_app.presentation.BaseView

interface StationsContract {
    interface View: BaseView<Presenter> {
        fun showLoadingIndicator()
        fun hideLoadingIndicator()
        fun showStations(stations: List<Station>)
    }

    interface Presenter: BasePresenter {
        fun filterStations(query: String)
    }
}