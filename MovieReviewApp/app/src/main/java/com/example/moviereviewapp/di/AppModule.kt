package com.example.moviereviewapp.di

import com.example.moviereviewapp.data.api.MovieApi
import com.example.moviereviewapp.data.api.MovieFirestoreApi
import com.example.moviereviewapp.data.api.ReviewApi
import com.example.moviereviewapp.data.api.ReviewFirestoreApi
import com.example.moviereviewapp.data.repository.MovieRepository
import com.example.moviereviewapp.data.repository.MovieRepositoryImpl
import com.example.moviereviewapp.data.repository.ReviewRepository
import com.example.moviereviewapp.data.repository.ReviewRepositoryImpl
import com.example.moviereviewapp.domain.usecase.GetAllMoviesUseCase
import com.example.moviereviewapp.domain.usecase.GetAllMovieReviewsUseCase
import com.example.moviereviewapp.domain.usecase.GetRandomFeaturedMovieUseCase
import com.example.moviereviewapp.presentation.home.HomeContract
import com.example.moviereviewapp.presentation.home.HomeFragment
import com.example.moviereviewapp.presentation.home.HomePresenter
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.Dispatchers
import org.koin.dsl.module

val appModule = module {
    single { Dispatchers.IO }
}

val dataModule = module {
    single { Firebase.firestore }

    single<MovieApi> { MovieFirestoreApi(get()) }
    single<ReviewApi> { ReviewFirestoreApi(get()) }

    single<MovieRepository> { MovieRepositoryImpl(get(), get()) }
    single<ReviewRepository> { ReviewRepositoryImpl(get(), get()) }
}

val domainModule = module {
    factory { GetRandomFeaturedMovieUseCase(get(), get()) }
    factory { GetAllMoviesUseCase(get()) }
    factory { GetAllMovieReviewsUseCase(get()) }
}

val presenterModule = module {
    scope<HomeFragment> {
        scoped<HomeContract.Presenter> { HomePresenter(getSource()!!, get(), get()) }
    }
}