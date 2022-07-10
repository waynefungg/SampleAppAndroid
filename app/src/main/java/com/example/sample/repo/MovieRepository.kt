package com.example.sample.repo

import com.example.sample.repo.model.Movie
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MovieRepository @Inject constructor() {
    fun getMovieList(): List<Movie> {
        return movies
    }

    fun getMovie(movieId: String): Movie {
        return movies.first {
            it.id == movieId
        }
    }

    private val movies = listOf(
        Movie(
            id = "tt1630029",
            title = "Avatar: The Way of Water",
            releaseDate = "12/12/2022",
            moviePoster = "https://www.themoviedb.org/t/p/original/4Vv1cTlBSj9a3YQ9pYIjxZEMyC2.jpg",
            movieCover = "https://image.tmdb.org/t/p/w1066_and_h600_bestv2/wEQ0Pu2jEyqHKOJRAdAKaeTFCML.jpg",
            desc = "Set more than a decade after the events of the first film, learn the story of the Sully family (Jake, Neytiri, and their kids), the trouble that follows them, the lengths they go to keep each other safe, the battles they fight to stay alive, and the tragedies they endure."
        ),
        Movie(
            id = "tt4593060",
            title = "Pinocchio",
            releaseDate = "08/09/2022",
            moviePoster = "https://m.media-amazon.com/images/M/MV5BNDZiMTA3ZjEtZGJjNS00OTkwLWFiYzUtZjdkZDUxZTVlZTY0XkEyXkFqcGdeQXVyMTM1MTE1NDMx._V1_.jpg",
            movieCover = "https://image.tmdb.org/t/p/w1066_and_h600_bestv2/hNou5JVGr5vj4ZRScLDuX6xMPjh.jpg",
            desc = "A live-action adaptation of Disney's 'Pinocchio'."
        ),
        Movie(
            id = "tt2906216",
            title = "Dungeons & Dragons",
            releaseDate = "02/03/2023",
            moviePoster = "https://m.media-amazon.com/images/M/MV5BYjQyMzZjYjMtMTA5Yi00MmFlLWEwYjItZDc3ZDA2ZmUxMDVjXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_.jpg",
            movieCover = "https://image.tmdb.org/t/p/w1066_and_h600_bestv2/wLAxiLDgc4lFesEo3WzD3kHUJ7E.jpg",
            desc = "Looking to rob a conman who stole all his loot, a thief gathers a party consisting of a barbarian, a wizard, and a druid to venture forth to foil the conman who now presides as the Lord of Neverwinter."
        ),
        Movie(
            id = "tt10648342",
            title = "Thor: Love and Thunder",
            releaseDate = "08/07/2022 ",
            moviePoster = "https://image.tmdb.org/t/p/w1280/4zLfBbGnuUBLbMVtagTZvzFwS8l.jpg",
            movieCover = "https://image.tmdb.org/t/p/w1066_and_h600_bestv2/bcpATvKQmSgCbwxONs9PPQrer3A.jpg",
            desc = "After his retirement is interrupted by Gorr the God Butcher, a galactic killer who seeks the extinction of the gods, Thor enlists the help of King Valkyrie, Korg, and ex-girlfriend Jane Foster, who now inexplicably wields Mjolnir as the Mighty Thor. Together they embark upon a harrowing cosmic adventure to uncover the mystery of the God Butcher’s vengeance and stop him before it’s too late."
        ),
        Movie(
            id = "tt10954984",
            title = "Nope",
            releaseDate = "08/07/2022",
            moviePoster = "https://image.tmdb.org/t/p/w440_and_h660_face/rjZlYvRnFRDNPVyBucFCfQa8LJM.jpg",
            movieCover = "https://image.tmdb.org/t/p/w1066_and_h600_bestv2/b30859fwJOq8sBXmXf3lrePUEdO.jpg",
            desc = "Residents in a lonely gulch of inland California bear witness to an uncanny, chilling discovery."
        ),
        Movie(
            id = "tt12004038",
            title = "Watcher",
            releaseDate = "08/09/2023",
            moviePoster = "https://image.tmdb.org/t/p/w440_and_h660_face/t6UCz7syPrlJ2LQQBFLWiF37f19.jpg",
            movieCover = "https://image.tmdb.org/t/p/w1066_and_h600_bestv2/2cQMVHBaP1wK0UBX5SGDahB3lp3.jpg",
            desc = "A young American woman moves with her husband to Bucharest, and begins to suspect that a stranger who watches her from the apartment building across the street may be a local serial killer decapitating women."
        ),
        Movie(
            id = "tt4593060",
            title = "Pinocchio",
            releaseDate = "08/09/2022",
            moviePoster = "https://m.media-amazon.com/images/M/MV5BNDZiMTA3ZjEtZGJjNS00OTkwLWFiYzUtZjdkZDUxZTVlZTY0XkEyXkFqcGdeQXVyMTM1MTE1NDMx._V1_.jpg",
            movieCover = "https://image.tmdb.org/t/p/w1066_and_h600_bestv2/hNou5JVGr5vj4ZRScLDuX6xMPjh.jpg",
            desc = "A live-action adaptation of Disney's 'Pinocchio'."
        ),
        Movie(
            id = "tt2906216",
            title = "Dungeons & Dragons",
            releaseDate = "02/03/2023",
            moviePoster = "https://m.media-amazon.com/images/M/MV5BYjQyMzZjYjMtMTA5Yi00MmFlLWEwYjItZDc3ZDA2ZmUxMDVjXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_.jpg",
            movieCover = "https://image.tmdb.org/t/p/w1066_and_h600_bestv2/wLAxiLDgc4lFesEo3WzD3kHUJ7E.jpg",
            desc = "Looking to rob a conman who stole all his loot, a thief gathers a party consisting of a barbarian, a wizard, and a druid to venture forth to foil the conman who now presides as the Lord of Neverwinter."
        ),
        Movie(
            id = "tt10648342",
            title = "Thor: Love and Thunder",
            releaseDate = "08/07/2022 ",
            moviePoster = "https://image.tmdb.org/t/p/w1280/4zLfBbGnuUBLbMVtagTZvzFwS8l.jpg",
            movieCover = "https://image.tmdb.org/t/p/w1066_and_h600_bestv2/bcpATvKQmSgCbwxONs9PPQrer3A.jpg",
            desc = "After his retirement is interrupted by Gorr the God Butcher, a galactic killer who seeks the extinction of the gods, Thor enlists the help of King Valkyrie, Korg, and ex-girlfriend Jane Foster, who now inexplicably wields Mjolnir as the Mighty Thor. Together they embark upon a harrowing cosmic adventure to uncover the mystery of the God Butcher’s vengeance and stop him before it’s too late."
        ),
        Movie(
            id = "tt10954984",
            title = "Nope",
            releaseDate = "08/07/2022",
            moviePoster = "https://image.tmdb.org/t/p/w440_and_h660_face/rjZlYvRnFRDNPVyBucFCfQa8LJM.jpg",
            movieCover = "https://image.tmdb.org/t/p/w1066_and_h600_bestv2/b30859fwJOq8sBXmXf3lrePUEdO.jpg",
            desc = "Residents in a lonely gulch of inland California bear witness to an uncanny, chilling discovery."
        ),
        Movie(
            id = "tt12004038",
            title = "Watcher",
            releaseDate = "08/09/2023",
            moviePoster = "https://image.tmdb.org/t/p/w440_and_h660_face/t6UCz7syPrlJ2LQQBFLWiF37f19.jpg",
            movieCover = "https://image.tmdb.org/t/p/w1066_and_h600_bestv2/2cQMVHBaP1wK0UBX5SGDahB3lp3.jpg",
            desc = "A young American woman moves with her husband to Bucharest, and begins to suspect that a stranger who watches her from the apartment building across the street may be a local serial killer decapitating women."
        ),
        Movie(
            id = "tt4593060",
            title = "Pinocchio",
            releaseDate = "08/09/2022",
            moviePoster = "https://m.media-amazon.com/images/M/MV5BNDZiMTA3ZjEtZGJjNS00OTkwLWFiYzUtZjdkZDUxZTVlZTY0XkEyXkFqcGdeQXVyMTM1MTE1NDMx._V1_.jpg",
            movieCover = "https://image.tmdb.org/t/p/w1066_and_h600_bestv2/hNou5JVGr5vj4ZRScLDuX6xMPjh.jpg",
            desc = "A live-action adaptation of Disney's 'Pinocchio'."
        ),
        Movie(
            id = "tt2906216",
            title = "Dungeons & Dragons",
            releaseDate = "02/03/2023",
            moviePoster = "https://m.media-amazon.com/images/M/MV5BYjQyMzZjYjMtMTA5Yi00MmFlLWEwYjItZDc3ZDA2ZmUxMDVjXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_.jpg",
            movieCover = "https://image.tmdb.org/t/p/w1066_and_h600_bestv2/wLAxiLDgc4lFesEo3WzD3kHUJ7E.jpg",
            desc = "Looking to rob a conman who stole all his loot, a thief gathers a party consisting of a barbarian, a wizard, and a druid to venture forth to foil the conman who now presides as the Lord of Neverwinter."
        ),
        Movie(
            id = "tt10648342",
            title = "Thor: Love and Thunder",
            releaseDate = "08/07/2022 ",
            moviePoster = "https://image.tmdb.org/t/p/w1280/4zLfBbGnuUBLbMVtagTZvzFwS8l.jpg",
            movieCover = "https://image.tmdb.org/t/p/w1066_and_h600_bestv2/bcpATvKQmSgCbwxONs9PPQrer3A.jpg",
            desc = "After his retirement is interrupted by Gorr the God Butcher, a galactic killer who seeks the extinction of the gods, Thor enlists the help of King Valkyrie, Korg, and ex-girlfriend Jane Foster, who now inexplicably wields Mjolnir as the Mighty Thor. Together they embark upon a harrowing cosmic adventure to uncover the mystery of the God Butcher’s vengeance and stop him before it’s too late."
        ),
        Movie(
            id = "tt10954984",
            title = "Nope",
            releaseDate = "08/07/2022",
            moviePoster = "https://image.tmdb.org/t/p/w440_and_h660_face/rjZlYvRnFRDNPVyBucFCfQa8LJM.jpg",
            movieCover = "https://image.tmdb.org/t/p/w1066_and_h600_bestv2/b30859fwJOq8sBXmXf3lrePUEdO.jpg",
            desc = "Residents in a lonely gulch of inland California bear witness to an uncanny, chilling discovery."
        ),
        Movie(
            id = "tt12004038",
            title = "Watcher",
            releaseDate = "08/09/2023",
            moviePoster = "https://image.tmdb.org/t/p/w440_and_h660_face/t6UCz7syPrlJ2LQQBFLWiF37f19.jpg",
            movieCover = "https://image.tmdb.org/t/p/w1066_and_h600_bestv2/2cQMVHBaP1wK0UBX5SGDahB3lp3.jpg",
            desc = "A young American woman moves with her husband to Bucharest, and begins to suspect that a stranger who watches her from the apartment building across the street may be a local serial killer decapitating women."
        )
    )
}