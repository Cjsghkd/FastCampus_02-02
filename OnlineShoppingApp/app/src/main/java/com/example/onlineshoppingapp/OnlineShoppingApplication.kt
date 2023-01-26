package com.example.onlineshoppingapp

import android.app.Application
import com.example.onlineshoppingapp.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class OnlineShoppingApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(Level.ERROR)
            androidContext(this@OnlineShoppingApplication)
            modules(appModule)
        }
    }

}