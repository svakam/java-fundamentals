package inheritance;

import java.util.LinkedList;

public class Shop extends BusinessType {
    String name;
    float averageRating;
    String shopDescription;
    String price;

    public Shop(String name) {
        super(name);
        if (allReviews.size() > 0) {
            this.averageRating = updateRating();
        } else {
            this.averageRatingNA = "Rating unavailable. Add a review";
        }
    }

    // toString override
    public String toString() {
        return "Name of shop: " + this.name + "\nDescription: " + this.shopDescription + "\nAverage price: " + price
                + "\nAverage rating: " + averageRating;
    }

}
