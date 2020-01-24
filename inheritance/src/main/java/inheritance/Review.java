package inheritance;

public class Review {
    // variables
    String bodyText;
    String author;
    int reviewStars;

    // constructor
    public Review(String bodyText, String author, int reviewStars) {
        this.bodyText = bodyText;
        this.author = author;
        this.reviewStars = reviewStars;
    }

    public String toString() {
        return "Review description: " + bodyText + "\nAuthor: " + author + "\nRating by reviewer: " + reviewStars;
    }
}
