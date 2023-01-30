package com.example.subway_information_app.data.db.entity.mapper

import com.example.subway_information_app.data.db.entity.StationWithSubwaysEntity
import com.example.subway_information_app.data.db.entity.SubwayEntity
import com.example.subway_information_app.domain.Station
import com.example.subway_information_app.domain.Subway

fun StationWithSubwaysEntity.toStation() = Station(
    name = station.stationName,
    isFavorited = station.isFavorited,
    connectedSubways = subways.toSubways()
)

fun List<StationWithSubwaysEntity>.toStations() = map { it.toStation() }

fun List<SubwayEntity>.toSubways(): List<Subway> = map { Subway.findById(it.subwayId) }