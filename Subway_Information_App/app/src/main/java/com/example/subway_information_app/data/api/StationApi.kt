package com.example.subway_information_app.data.api

import com.example.subway_information_app.data.db.entity.StationEntity
import com.example.subway_information_app.data.db.entity.SubwayEntity

interface StationApi {
    suspend fun getStationDataUpdatedTimeMillis(): Long
    suspend fun getStationSubways(): List<Pair<StationEntity, SubwayEntity>>
}