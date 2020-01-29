package inheritance;

import java.util.LinkedList;

public class BusinessType implements Reviewable {
    // variables inherited by all business types: name and average rating; average rating of a business depends on list of reviews for
    // the business
    String name;
    float averageRating;

    LinkedList<Review> allReviews;
    String averageRatingNA;

    public BusinessType(String name){
        this.name = name;
    }

    // addReview should associate new review with restaurant instance
    // addReview should update star rating when new review associated
    public void addReview(Review newReview) {
        // link review to restaurant
        if (allReviews != null) {
            allReviews.add(newReview);
        } else {
            System.out.println("exception");
        }
    }

    // iterate through LL, add up stars and divide by number of nodes present
    public float updateRating() {
        int reviewCounter = 0;
        int totalStars = 0;
        for (Review review : allReviews) {
            reviewCounter++;
            totalStars += review.reviewStars;
        }
        return (float) totalStars / reviewCounter;
    }
}
