package com.example.sample.ui.movie.moviedetail

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.sample.repo.MovieRepository
import com.example.sample.repo.model.Movie
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MovieDetailViewModel @Inject constructor(private val movieRepo: MovieRepository) :
    ViewModel() {
    var movie: MutableState<Movie?> = mutableStateOf(null)

    fun init(movieId: String) {
        movie.value = movieRepo.getMovie(movieId)
    }
}