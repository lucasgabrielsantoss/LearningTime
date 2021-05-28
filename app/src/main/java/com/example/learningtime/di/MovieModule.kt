package com.example.learningtime.di

import com.example.learningtime.home.apresentation.viewmodel.PopularMoviesViewModel
import com.example.learningtime.home.data.api.ServiceRetrofit
import com.example.learningtime.home.data.mapper.PopularMoviesMapper
import com.example.learningtime.home.data.repository.PopularMoviesRepositoryImpl
import com.example.learningtime.home.domain.usecase.PopularMoviesUseCase
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module

object MovieModule {
    private val viewModelModule = module {
        single { ServiceRetrofit() }

        factory { PopularMoviesRepositoryImpl() }

        factory { PopularMoviesMapper() }

        factory { PopularMoviesUseCase(repository = get()) }

        viewModel { PopularMoviesViewModel(useCase = get()) }
    }

    fun init() = loadKoinModules(viewModelModule)

}