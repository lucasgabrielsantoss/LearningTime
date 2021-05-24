package com.example.learningtime.home.data.model

import com.google.gson.annotations.SerializedName

data class ResultMovieResponse(
    @SerializedName("page")val page: Int,
    @SerializedName("result")val resultsMovieResponse: List<MovieResponse>,
    @SerializedName("total_pages")val total_pages: Int,
    @SerializedName("total_results")val total_results: Int
)
