package com.example.subway_information_app.data.repository

import com.example.subway_information_app.domain.Station
import kotlinx.coroutines.flow.Flow

interface StationRepository {
    val stations: Flow<List<Station>>
    suspend fun refreshStations()
}