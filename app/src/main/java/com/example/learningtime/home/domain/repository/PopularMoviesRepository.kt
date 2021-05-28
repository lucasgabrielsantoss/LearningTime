package com.example.learningtime.home.domain.repository

import com.example.learningtime.home.domain.model.MovieModel

interface PopularMoviesRepository {
    suspend fun getMoviePopularList(): List<MovieModel>
}