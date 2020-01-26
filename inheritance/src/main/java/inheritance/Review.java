package inheritance;

public class Review {
    // variables
    String bodyText;
    String author;
    int reviewStars;
    String movie;

    // constructor
    public Review(String bodyText, String author, int reviewStars) {
        this.bodyText = bodyText;
        this.author = author;
        this.reviewStars = reviewStars;
    }

    // constructor only for movies
    public movieReview(String bodyText, String author, int reviewStars, String movie) {
        this.bodyText = bodyText;
        this.author = author;
        this.reviewStars = reviewStars;
        this.movie = movie;
    }

    public String toString() {
        return "Review description: " + bodyText + "\nAuthor: " + author + "\nRating by reviewer: " + reviewStars;
    }
}
