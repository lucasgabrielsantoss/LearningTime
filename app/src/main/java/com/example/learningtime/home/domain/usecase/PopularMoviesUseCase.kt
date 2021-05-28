package com.example.learningtime.home.domain.usecase

import com.example.learningtime.home.data.model.MovieResponse
import com.example.learningtime.home.data.repository.PopularMoviesRepositoryImpl
import com.example.learningtime.home.domain.model.MovieModel
import com.example.learningtime.home.domain.repository.PopularMoviesRepository

class PopularMoviesUseCase(private val repository: PopularMoviesRepositoryImpl) {

    suspend fun getPopularMovies(): List<MovieModel> {
        return repository.getMoviePopularList()
    }
}