package com.example.moviereviewapp.data.api

import com.example.moviereviewapp.domain.model.Movie
import com.google.firebase.firestore.FieldPath
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

    override suspend fun getMovies(movieId: List<String>): List<Movie> =
        firestore.collection("movies")
            .whereIn(FieldPath.documentId(), movieId)
            .get()
            .await()
            .map { it.toObject<Movie>() }
}