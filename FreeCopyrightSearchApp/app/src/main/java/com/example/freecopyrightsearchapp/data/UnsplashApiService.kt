package com.example.freecopyrightsearchapp.data

import com.example.freecopyrightsearchapp.BuildConfig
import com.example.freecopyrightsearchapp.data.models.PhotoResponse
import retrofit2.Response
import retrofit2.http.Query
import retrofit2.http.GET

interface UnsplashApiService {

    @GET(
        "photos/random?" +
                "client_id=${BuildConfig.UNSPLASH_ACCESS_KEY}" +
                "&count=30"
    )
    suspend fun getRandomPhotos(
        @Query("query") query: String?
    ): Response<List<PhotoResponse>>
}