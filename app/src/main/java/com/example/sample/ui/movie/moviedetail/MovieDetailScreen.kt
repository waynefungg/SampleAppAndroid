package com.example.sample.ui.movie.moviedetail

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.sample.ui.navgraph.TopNavigation

@Composable
fun MovieDetailScreen(movieId: String, vm: MovieDetailViewModel, goBack: () -> Boolean) {

    val movie = vm.movie.value

    vm.init(movieId)

    Scaffold(
        topBar = {
            TopNavigation(title = movie?.title ?: "", goBack)
        }
    ) {
        Surface {
            Column {
                AsyncImage(
                    model = movie?.movieCover,
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                )
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    text = movie?.title ?: "",
                    style = MaterialTheme.typography.h4,
                    textAlign = TextAlign.Center
                )
                Text(
                    modifier = Modifier.padding(16.dp),
                    text = movie?.desc ?: "",
                    fontSize = 12.sp
                )
                Button(modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(), onClick = { /*TODO*/ }) {
                    Text(text = "Subscribe")
                }
            }
        }
    }
}

@Composable
fun EmptyScreen() {
    Text(text = "Empty")
}