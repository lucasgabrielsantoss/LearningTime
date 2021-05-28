package com.example.learningtime.search.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.lifecycle.Observer
import com.example.learningtime.R
import com.example.learningtime.home.apresentation.state.MovieState
import com.example.learningtime.home.apresentation.viewmodel.PopularMoviesViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val teste: Button by lazy { findViewById(R.id.testes) }
    private val viewModel: PopularMoviesViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        teste.setOnClickListener {
            viewModel.getMovies()
        }
    }
}
//    fun initObs(){
//        viewModel.stateView.observe(this, Observer { state ->
//            state?.let {
//                when(state){
//                    is MovieState.Success ->
//                }
//            }
//
//        })
//    }
//}