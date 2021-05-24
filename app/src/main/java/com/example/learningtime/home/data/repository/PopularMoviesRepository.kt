package com.example.learningtime.home.data.repository

import com.example.learningtime.home.data.api.ServiceRetrofit
import com.example.learningtime.home.data.mapper.PopularMoviesMapper
import com.example.learningtime.home.domain.model.MovieModel
import com.example.learningtime.home.domain.repository.PopularMoviesRepositoryImpl

class PopularMoviesRepository(private val popularMoviesMapper: PopularMoviesMapper) :
    PopularMoviesRepositoryImpl {
    override suspend fun getMoviePopularList(): List<MovieModel> {
        return ServiceRetrofit.service.getPopularMovies().resultsMovieResponse.map {
            popularMoviesMapper.map(it)
        }
    }
}