package com.example.musicstreamingapp.service

import retrofit2.Call
import retrofit2.http.GET

interface MusicService {
    @GET("/v3/b3e235f9-bc96-4ffd-9bc3-2cc49944454c")
    fun listMusics(): Call<MusicDto>
}