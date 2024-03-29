package com.example.moviereviewapp

import android.app.Application
import com.example.moviereviewapp.di.appModule
import com.example.moviereviewapp.di.dataModule
import com.example.moviereviewapp.di.domainModule
import com.example.moviereviewapp.di.presenterModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MovieReviewApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(
                if (BuildConfig.DEBUG) {
                    Level.DEBUG
                } else {
                    Level.NONE
                }
            )
            androidContext(this@MovieReviewApplication)
            modules(appModule + dataModule + domainModule + presenterModule)
        }

//        MovieDataGenerator().generate()
    }
}