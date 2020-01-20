package inheritance;

import org.junit.Test;

public class RestaurantTest {
    @Test public void testConstructor() {
        Restaurant burgerPlace = new Restaurant("Burger Place", 0, "$$");
        System.out.println(burgerPlace);
    }

    @Test public void testAddReview() {
        Restaurant burgerTown = new Restaurant("Burger Town", 0, "$$");
        burgerTown.addReview(new Review("Burger Town", 0, "$$$$",
                "Meat was DRIPPING in oil bruh. I paid $30 for what looks like a cow in Exxon Valdez???", "Vik", 2));
        System.out.println(burgerTown);
    }
}
