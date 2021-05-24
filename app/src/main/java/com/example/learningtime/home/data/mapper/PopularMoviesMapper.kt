package com.example.learningtime.home.data.mapper

import com.example.learningtime.home.data.model.MovieResponse
import com.example.learningtime.home.domain.model.MovieModel

class PopularMoviesMapper : Mapper<MovieResponse, MovieModel> {

    override fun map(source: MovieResponse): MovieModel {
        return MovieModel(
            adult = source.adult,
            backdropPath = source.backdropPath,
            genreIds = source.genreIds,
            id = source.id,
            originalLanguage = source.originalLanguage,
            originalTitle = source.originalTitle,
            overview = source.overview,
            popularity = source.popularity,
            posterPath = source.posterPath,
            releaseDate = source.releaseDate,
            title = source.title,
            video = source.video,
            voteAverage = source.voteAverage,
            voteCount = source.voteCount
        )
    }
}

interface Mapper<S, T> {
    fun map(source: S): T
}

