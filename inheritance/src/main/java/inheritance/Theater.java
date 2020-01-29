package inheritance;

import java.util.LinkedList;

public class Theater extends BusinessType implements ChangeMovies {
    // variables
    String movies;

    public Theater(String name, String movie) {
        super(name);
        if (allReviews != null) {
            this.averageRating = updateRating();
        } else {
            this.averageRatingNA = "Rating unavailable. Add a review";
        }
        // movie seen
        this.movies = movie;
    }

    public void addMovie(String movie) {
        movies += ", " + movie;
    }

    public String removeMovie() {
        // remove movie from String movies
        // using substring API at commas
        int index = movies.indexOf(",");
        System.out.println("index = " + index);
        return movies.substring(index+2);
    }
}
