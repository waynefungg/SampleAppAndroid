package com.example.sample.ui.navgraph

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.navArgument
import com.example.sample.ui.movie.moviedetail.EmptyScreen
import com.example.sample.ui.movie.moviedetail.MovieDetailScreen
import com.example.sample.ui.movie.movielist.MovieListScreen
import com.example.sample.ui.movie.upcoming.UpComingScreen

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController, startDestination = BottomNavItem.MyMovie.screen_route) {
        composable(BottomNavItem.UpComing.screen_route) {
            UpComingScreen(hiltViewModel(), {})
        }
        composable(BottomNavItem.MyMovie.screen_route) {
            MovieListScreen(
                hiltViewModel(),
                selectedMovie = { movieId -> navController.navigate("${DetailsScreen.Details.route}/${movieId}") })
        }
        composable(BottomNavItem.Other.screen_route) {
            EmptyScreen()
        }

        detailsNavGraph(navController = navController)
    }
}


fun NavGraphBuilder.detailsNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.DETAILS,
        startDestination = DetailsScreen.Details.route
    ) {
        composable(
            route = DetailsScreen.Details.routeWithArgument,
            arguments = listOf(
                navArgument(DetailsScreen.Details.argument0) { type = NavType.StringType }
            )
        ) {
            val movieId =
                it.arguments?.getString(DetailsScreen.Details.argument0) ?: return@composable
            MovieDetailScreen(movieId = movieId, hiltViewModel()) { navController.navigateUp() }
        }
    }
}

sealed class DetailsScreen(val route: String) {
    object Details : DetailsScreen(route = "details") {
        const val routeWithArgument: String = "details/{movieId}"
        const val argument0: String = "movieId"
    }
}