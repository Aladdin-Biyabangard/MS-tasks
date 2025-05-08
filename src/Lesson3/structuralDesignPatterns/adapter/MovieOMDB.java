package Lesson3.structuralDesignPatterns.adapter;

public class MovieOMDB {

    private String title;
    private String actors;
    private String plot;
    private String genre;
    private String runtime;

    public MovieOMDB() {
    }

    public MovieOMDB(String title, String actors, String plot, String genre, String runtime) {
        this.title = title;
        this.actors = actors;
        this.plot = plot;
        this.genre = genre;
        this.runtime = runtime;
    }

    public String getTitle() {
        return title;
    }

    public String getActors() {
        return actors;
    }

    public String getPlot() {
        return plot;
    }

    public String getGenre() {
        return genre;
    }

    public String getRuntime() {
        return runtime;
    }

    public MovieOMDB getMovieByTitle(String title) {
       return new MovieOMDB(title,"Aladdin","New film","Unknown","120");
    }
}
