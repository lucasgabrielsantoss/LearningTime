package com.example.learningtime.home.domain.repository

import com.example.learningtime.home.domain.model.MovieModel

interface PopularMoviesRepositoryImpl {
    suspend fun getMoviePopularList(): List<MovieModel>
}