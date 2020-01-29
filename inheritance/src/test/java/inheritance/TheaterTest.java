package inheritance;

import org.junit.Test;

public class TheaterTest {
    @Test
    public void testConstructor() {
        Theater theater = new Theater("A Theater", "Inception");
        System.out.println(theater);
    }

    @Test public void testAddReviewWithoutMovie() {
        Theater theater = new Theater("A Theater", "Inception, The Dark Knight");
        theater.addReview(new Review("Great movie", "Vik", 5));
        System.out.println("theater = " + theater);
    }
    
    @Test public void testAddReviewWithMovie() {
        Theater theater = new Theater("A Theater", "Inception, The Dark Knight");
        theater.addReview(new Review("Amazing movie", "Vik", 5, "The Dark Knight"));
        System.out.println(theater);
    }

    @Test public void testAddMovie() {
        Theater theater = new Theater("A Theater", "Inception, The Dark Knight");
        theater.addMovie("Interstellar");
        System.out.println("theater.movies = " + theater.movies);
    }

    @Test public void testRemoveMovie() {
        Theater theater = new Theater("A Theater", "Inception, The Dark Knight, Interstellar");
        System.out.println(theater.removeMovie());
    }
}
