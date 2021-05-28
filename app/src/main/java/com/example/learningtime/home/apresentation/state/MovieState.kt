package com.example.learningtime.home.apresentation.state

import com.example.learningtime.home.domain.model.MovieModel

sealed class MovieState {
    data class Loading(val visibility: Int) : MovieState()
    data class Success(val movies : List<MovieModel>): MovieState()
}