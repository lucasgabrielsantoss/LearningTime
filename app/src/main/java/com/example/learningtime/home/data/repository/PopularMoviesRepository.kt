package com.example.learningtime.home.data.repository

import com.example.learningtime.home.data.api.ServiceRetrofit
import com.example.learningtime.home.domain.model.MovieModel
import com.example.learningtime.home.domain.repository.PopularMoviesRepository

class PopularMoviesRepositoryImpl :
    PopularMoviesRepository {
    override suspend fun getMoviePopularList(): List<MovieModel> =
        ServiceRetrofit.service.getPopularMovies().resultsMovieResponse
            .map { source ->
            MovieModel(
                adult = source.adult?: false,
                backdropPath = source.backdropPath ?: "",
                genreIds = source.genreIds?: listOf(),
                id = source.id?: 0,
                originalLanguage = source.originalLanguage?: "",
                originalTitle = source.originalTitle?: "",
                overview = source.overview?: "",
                popularity = source.popularity?: 0.0,
                posterPath = source.posterPath?: "",
                releaseDate = source.releaseDate?: "",
                title = source.title?: "",
                video = source.video?: false,
                voteAverage = source.voteAverage?: 0f,
                voteCount = source.voteCount?: 0
            )
        }
}