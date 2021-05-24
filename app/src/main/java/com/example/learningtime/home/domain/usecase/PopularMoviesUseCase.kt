package com.example.learningtime.home.domain.usecase

import com.example.learningtime.home.data.repository.PopularMoviesRepository
import com.example.learningtime.home.domain.model.MovieModel

class PopularMoviesUseCase(private val repository: PopularMoviesRepository) {

    suspend fun getPopularMovies(): List<MovieModel> {
        return repository.getMoviePopularList()

    }
}