package com.example.moviereviewapp.data.api

import com.example.moviereviewapp.domain.model.Movie
import com.google.firebase.firestore.ktx.toObject
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await

class MovieFirestoreApi(
    private val firestore: FirebaseFirestore
): MovieApi {

    override suspend fun getAllMovies(): List<Movie> =
        firestore.collection("movies")
            .get()
            .await()
            .map { it.toObject<Movie>() }
}