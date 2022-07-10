package com.example.sample.ui.navgraph

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun TopNavigation(title: String, goBack: () -> Boolean) {
    TopAppBar(
        title = {
            Text(
                text = title,
                color = Color.White
            )
        },
        navigationIcon = {
            IconButton(onClick = {
                goBack()
            }) {
                Icon(Icons.Filled.ArrowBack, "Back")
            }
        },
        contentColor = Color.White,
        elevation = 12.dp
    )
}