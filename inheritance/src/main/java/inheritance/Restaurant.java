package inheritance;

import java.util.LinkedList;
import java.util.ListIterator;

public class Restaurant extends BusinessType {
    String price;
    LinkedList<Review> allReviews;

    public Restaurant(String name) {
        super(name);
        if (allReviews.size() > 0) {
            this.averageRating = updateRating();
        } else {
            this.averageRatingNA = "Rating unavailable. Add a review";
        }
    }

    // toString override
    public String toString() {
        return "Name: " + name + "\nRating: " + averageRating + "\nPrice: " + price + "\n Reviews: " + allReviews;
    }
}
