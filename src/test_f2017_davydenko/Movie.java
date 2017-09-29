package test_f2017_davydenko;

import java.time.LocalDate;

/**
 *
 * @author Dasha
 */
public class Movie {

    private String movieName, genre, description;
    private int yearReleased;

    public Movie(String movieName, String genre, String description, int yearReleased) {
        setMovieName(movieName);
        setDescription(description);
        setGenre(genre);
        setYearReleased(yearReleased);
    }

    public void setMovieName(String movieName) {

        if (!movieName.isEmpty()) {
            this.movieName = movieName;
        } else {
            throw new IllegalArgumentException("Movie can't be empety");
        }
    }

    public void setGenre(String genre) {
        if (genre.equalsIgnoreCase("comedy")
                || genre.equalsIgnoreCase("drama")
                || genre.equalsIgnoreCase("thriller")
                || genre.equalsIgnoreCase("western")
                || genre.equalsIgnoreCase("action")
                || genre.equalsIgnoreCase("adventure")
                || genre.equalsIgnoreCase("animation")
                || genre.equalsIgnoreCase("documentary")) {
            this.genre = genre.toLowerCase();
        } else {
            throw new IllegalArgumentException("Please, enter proper genre");
        }
    }

    public void setDescription(String description) {
        if (!description.isEmpty()) {
            this.description = description;
        } else {
            throw new IllegalArgumentException("Description can't be empety");
        }
    }

    public void setYearReleased(int yearReleased) {
        int today = LocalDate.now().getYear();
        if (yearReleased >= 1889) {
            if (yearReleased <= today + 1) {
                this.yearReleased = yearReleased;
            } else {
                throw new IllegalArgumentException("This movie is from the future");
            }
        } else {
            throw new IllegalArgumentException("Movie should be created not earlier then 1889");
        }
    }

    @Override
    public String toString() {
        return movieName + ", released in " + yearReleased;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getGenre() {
        return genre;
    }

    public String getDescription() {
        return description;
    }

    public int getYearReleased() {
        return yearReleased;
    }
}
