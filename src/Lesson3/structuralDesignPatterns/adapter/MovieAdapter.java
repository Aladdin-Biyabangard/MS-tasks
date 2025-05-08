package Lesson3.structuralDesignPatterns.adapter;

public class MovieAdapter {

    Movie adapterMovieFromOMDB(MovieOMDB movieOMDB) {
        return new Movie(movieOMDB.getTitle(),
                movieOMDB.getActors(),
                movieOMDB.getPlot(),
                movieOMDB.getGenre(),
                movieOMDB.getRuntime()
        );
    }

}
