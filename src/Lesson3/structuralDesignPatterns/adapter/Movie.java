package Lesson3.structuralDesignPatterns.adapter;

public class Movie {

    private String movieName;
    private String actor;
    private String description;
    private String movieGenre;
    private String lengthFilm;

    public Movie() {
    }

    public Movie(String movieName, String actor, String description, String movieGenre, String lengthFilm) {
        this.movieName = movieName;
        this.actor = actor;
        this.description = description;
        this.movieGenre = movieGenre;
        this.lengthFilm = lengthFilm;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public String getLengthFilm() {
        return lengthFilm;
    }

    public void setLengthFilm(String lengthFilm) {
        this.lengthFilm = lengthFilm;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", actor='" + actor + '\'' +
                ", description='" + description + '\'' +
                ", movieGenre='" + movieGenre + '\'' +
                ", lengthFilm='" + lengthFilm + '\'' +
                '}';
    }
}
