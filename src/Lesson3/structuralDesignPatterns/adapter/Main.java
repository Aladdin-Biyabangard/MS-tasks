package Lesson3.structuralDesignPatterns.adapter;

public class Main {
    public static void main(String[] args) {
        MovieOMDB movieOMDB = new MovieOMDB();

        MovieAdapter movieAdapter = new MovieAdapter();

        MovieService movieService = new MovieServiceImpl(movieOMDB, movieAdapter);

        Movie movie = movieService.getMovieViaOMDB("Redcon-1");

        System.out.println(movie);
    }
}
