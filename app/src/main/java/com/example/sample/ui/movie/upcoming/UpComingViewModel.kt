package com.example.sample.ui.movie.upcoming

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.sample.repo.MovieRepository
import com.example.sample.repo.model.Movie
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UpComingViewModel @Inject constructor(private val movieRepo: MovieRepository) : ViewModel() {
    init {
        viewModelScope.launch(Dispatchers.Main) {
            movieListState.value = movieRepo.getMovieList()
        }
    }

    var movieListState: MutableState<List<Movie>> = mutableStateOf(emptyList())
}