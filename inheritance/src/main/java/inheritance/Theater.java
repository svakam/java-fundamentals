package inheritance;

import java.util.LinkedList;

public class Theater extends BusinessType implements ChangeMovies {
    // variables
    String movies;
    LinkedList<Review> allReviews;

    public Theater(String name, String movie) {
        super(name);
        if (allReviews.size() > 0) {
            this.averageRating = updateRating();
        } else {
            this.averageRatingNA = "Rating unavailable. Add a review";
        }
        // movie seen
        this.movies = movie;
    }

    public void addMovie() {
        // add movie to String movies
        movies += "new movie";
    }

    public void removeMovie() {
        // remove movie from String movies
    }
}
