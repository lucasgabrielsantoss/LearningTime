package com.example.learningtime.home.apresentation.viewmodel

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.learningtime.home.apresentation.state.MovieState
import com.example.learningtime.home.domain.usecase.PopularMoviesUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.lang.Exception

class PopularMoviesViewModel(private val useCase: PopularMoviesUseCase) : ViewModel() {

    private val state: MutableLiveData<MovieState> = MutableLiveData()
    val stateView: LiveData<MovieState> = state

    fun getMovies() {
        viewModelScope.launch {

            state.value = MovieState.Loading(View.GONE)
            try {
                 withContext(Dispatchers.Main){
                    useCase.getPopularMovies()
                }
                //state.value = MovieState.Success(movies)
            } catch (ex: Exception){
                ex.printStackTrace()
            }
        }
    }
}