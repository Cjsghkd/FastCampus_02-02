package com.example.locationsearchmapapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SearchResultEntity(
    val fullAddress : String,
    val name : String,
    val locationLatLng : LocationLatLngEntity
) : Parcelable
