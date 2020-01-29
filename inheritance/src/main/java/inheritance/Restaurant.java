package inheritance;

import java.util.LinkedList;
import java.util.ListIterator;

public class Restaurant extends BusinessType {
    String price;

    public Restaurant(String name, String price) {
        super(name);
        this.price = price;
        if (allReviews != null) {
            this.averageRating = updateRating();
        } else {
            this.averageRatingNA = "Rating unavailable. Add a review";
        }
    }

    // toString override
    public String toString() {
        if (this.allReviews != null) {
            return "Name: " + name + "\nRating: " + averageRating + "\nPrice: " + price + "\n Reviews: " + allReviews;
        }
        else {
            return "Name: " + name + "\nRating: " + averageRatingNA + "\nPrice: " + price + "\nReviews: not available";
        }
    }
}
