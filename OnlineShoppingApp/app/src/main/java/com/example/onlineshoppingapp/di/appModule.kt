package com.example.onlineshoppingapp.di

import com.example.onlineshoppingapp.data.network.buildOkHttpClient
import com.example.onlineshoppingapp.data.network.provideGsonConverterFactory
import com.example.onlineshoppingapp.data.network.provideProductApiService
import com.example.onlineshoppingapp.data.network.provideProductRetrofit
import com.example.onlineshoppingapp.data.repository.DefaultProductRepository
import com.example.onlineshoppingapp.data.repository.ProductRepository
import com.example.onlineshoppingapp.domain.GetProductItemUseCase
import kotlinx.coroutines.Dispatchers
import org.koin.dsl.module

val appModule = module {
    // Coroutines Dispatcher
    single { Dispatchers.Main }
    single { Dispatchers.IO }

    // Repository
    single<ProductRepository> { DefaultProductRepository(get(), get()) }

    // UseCase
    factory { GetProductItemUseCase(get()) }

    single { provideGsonConverterFactory() }
    single { buildOkHttpClient() }
    single { provideProductRetrofit(get(), get()) }
    single { provideProductApiService(get()) }
}