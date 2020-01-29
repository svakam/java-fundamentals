package inheritance;

import java.util.LinkedList;

public class Shop extends BusinessType {
    String name;
    float averageRating;
    String shopDescription;
    String price;

    public Shop(String name, String shopDescription, String price) {
        super(name);
        this.shopDescription = shopDescription;
        this.price = price;
        if (allReviews.size() > 0) {
            this.averageRating = updateRating();
        } else {
            this.averageRatingNA = "Rating unavailable. Add a review";
        }
    }

    // toString override
    public String toString() {
        if (allReviews != null) {
            return "Name of shop: " + this.name + "\nDescription: " + this.shopDescription + "\nAverage price: " + price
                    + "\nAverage rating: " + averageRating;
        } else {
            return "Name of shop: " + this.name + "\nDescription: " + this.shopDescription + "\nAverage price: " + price
                    + "\nAverage rating: " + averageRatingNA;
        }
    }

}
