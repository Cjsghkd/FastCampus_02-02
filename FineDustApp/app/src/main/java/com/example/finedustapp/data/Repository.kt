package com.example.finedustapp.data

import com.example.finedustapp.BuildConfig
import com.example.finedustapp.data.services.KakaoLocalApiService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class Repository {

    suspend fun getNearbyMonitoringStation(REST_API_KEY: String,latitude: Double, longitude: Double) {
        val tmCoorinates = kakaoLocalApiService
            .getTmCoordinates(REST_API_KEY, longitude, latitude)
            .body()
            ?.documents
            ?.firstOrNull()

        val tmX = tmCoorinates?.x
        val tmY = tmCoorinates?.y
    }

    private val kakaoLocalApiService: KakaoLocalApiService by lazy {
        Retrofit.Builder()
            .baseUrl(Url.KAKAO_API_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(buildHttpClient())
            .build()
            .create()
    }

    private fun buildHttpClient(): OkHttpClient =
        OkHttpClient.Builder()
            .addInterceptor(
                HttpLoggingInterceptor().apply {
                    level = if (BuildConfig.DEBUG) {
                        HttpLoggingInterceptor.Level.BODY
                    } else {
                        HttpLoggingInterceptor.Level.NONE
                    }
                }
            ).build()
}