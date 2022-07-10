package com.example.sample.ui.movie.movielist

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.sample.repo.model.Movie

@Composable
fun MovieListScreen(vm: MovieListViewModel, selectedMovie: (String) -> Unit) {

    val movieList = vm.movieListState.value

    LazyColumn(contentPadding = PaddingValues(16.dp)) {
        items(movieList) { movie ->
            MovieItem(movie = movie, selectedMovie = selectedMovie)
        }
    }
}

@Composable
fun MovieItem(movie: Movie, selectedMovie: (String) -> Unit) {
    Card(
        shape = RoundedCornerShape(8.dp),
        elevation = 2.dp,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp)
            .clickable(onClick = { selectedMovie(movie.id) })
    ) {
        Row {
            AsyncImage(
                model = movie.moviePoster,
                contentDescription = null,
                modifier = Modifier
                    .size(68.dp, height = 88.dp)
                    .padding(4.dp),
            )
//            Image(
//                painter = rememberAsyncImagePainter(movie.moveCover),
//                contentDescription = null,
//                modifier = Modifier
//                    .size(88.dp)
//                    .padding(4.dp),
//                contentScale = ContentScale.Crop
//            )
            Column(
                modifier = Modifier
                    .align(Alignment.Top)
                    .padding(8.dp)
                    .weight(1f)
            ) {
                Text(
                    text = movie.title,
                    style = MaterialTheme.typography.h6
                )
            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .size(70.dp)
                    .padding(8.dp)

            ) {
                Text(
                    text = "12",
                    style = MaterialTheme.typography.h6
                )
                Text(text = "Days", fontSize = 12.sp, textAlign = TextAlign.Center)
            }
        }
    }
}