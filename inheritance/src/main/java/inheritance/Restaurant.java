package inheritance;

import java.util.LinkedList;
import java.util.ListIterator;

public class Restaurant {
    // variables
    String restaurantName;
    float averageRating;
    String price;
    LinkedList<Review> allReviews;

    // addReview should associate new review with restaurant instance
    // addReview should update star rating when new review associated
    public void addReview(Review newReview) {
        allReviews.add(newReview);
        // iterate through LL, add up stars and divide by number of nodes present
        int reviewCounter = 0;
        int totalStars = 0;
        for (Review review : allReviews) {
            reviewCounter++;
            totalStars += review.reviewStars;
        }
        this.averageRating = (float) totalStars / reviewCounter;
    }

    // constructor
    public Restaurant(String restaurantName, float averageRating, String price) {
        this.restaurantName = restaurantName;
        this.averageRating = averageRating;
        this.price = price;
        this.allReviews = new LinkedList<>();
    }

    // toString override
    public String toString() {
        return "Name: " + restaurantName + "\nRating: " + averageRating + "\nPrice: " + price + "\n Reviews: " + allReviews;
    }
}
