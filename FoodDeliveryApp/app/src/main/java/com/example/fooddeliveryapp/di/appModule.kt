package com.example.fooddeliveryapp.di

import com.example.fooddeliveryapp.screen.main.home.HomeViewModel
import com.example.fooddeliveryapp.screen.main.my.MyViewModel
import com.example.fooddeliveryapp.util.provider.DefaultResourcesProvider
import com.example.fooddeliveryapp.util.provider.ResourcesProvider
import kotlinx.coroutines.Dispatchers
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    viewModel { HomeViewModel() }
    viewModel { MyViewModel() }

    single { provideGsonConvertFactory() }
    single { buildOkHttpClient() }
    single { provideRetrofit(get(), get()) }

    single<ResourcesProvider> { DefaultResourcesProvider(androidApplication()) }

    single { Dispatchers.IO }
    single { Dispatchers.Main }
}