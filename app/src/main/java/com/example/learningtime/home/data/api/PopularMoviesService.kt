package com.example.learningtime.home.data.api

import com.example.learningtime.home.data.model.ResultMovieResponse
import retrofit2.http.GET
import retrofit2.http.Query

const val API_KEY = "e8014d38210f3e7f0d80009b43579fa7"

interface PopularMoviesService {

    @GET("movie/popular")
    suspend fun getPopularMovies(
        @Query("api_key") apiKey: String = API_KEY,
        @Query("language") language: String = "pt-BR",
        @Query("page") page: String = "1"
    ): ResultMovieResponse
}