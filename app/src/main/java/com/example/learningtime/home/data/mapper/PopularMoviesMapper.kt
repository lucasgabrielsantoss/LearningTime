package com.example.learningtime.home.data.mapper

import com.example.learningtime.home.data.model.MovieResponse
import com.example.learningtime.home.domain.model.MovieModel

class PopularMoviesMapper : Mapper<MovieResponse, MovieModel> {

    override fun map(source: MovieResponse): MovieModel {
        return MovieModel(
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

interface Mapper<S, T> {
    fun map(source: S): T
}

