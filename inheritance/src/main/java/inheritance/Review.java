package inheritance;

public class Review extends Restaurant {
    // variables
    String bodyText;
    String author;
    int reviewStars;

    // constructor
    public Review(String restaurantName, float averageRating, String price, String bodyText, String author, int reviewStars) {
        super(restaurantName, averageRating, price);
        this.bodyText = bodyText;
        this.author = author;
        this.reviewStars = reviewStars;
    }

    public String toString() {
        return "Restaurant name: " + restaurantName + "\nAverage Rating: " + averageRating + "\nPrice: " + price + "\nReview description: " + bodyText
                + "\nAuthor: " + author + "\nRating by reviewer: " + reviewStars;
    }
}
