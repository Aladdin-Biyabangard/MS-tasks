package Lesson3.structuralDesignPatterns.adapter;

public class MovieServiceImpl implements MovieService {

    private final MovieOMDB movieOMDB;
    private final MovieAdapter movieAdapter;

    public MovieServiceImpl(MovieOMDB movieOMDB, MovieAdapter movieAdapter) {
        this.movieOMDB = movieOMDB;
        this.movieAdapter = movieAdapter;
    }

    @Override
    public Movie getMovieViaOMDB(String movieName) {
        MovieOMDB movieByTitle = movieOMDB.getMovieByTitle(movieName);
        return movieAdapter.adapterMovieFromOMDB(movieByTitle);
    }
}
