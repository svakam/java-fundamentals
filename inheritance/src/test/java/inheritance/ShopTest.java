package inheritance;

import org.junit.Test;

public class ShopTest {
    @Test public void testShopInstance() {
//      test instantiation
        Shop Gertrude = new Shop("Gertrude's Golly Guitars", "Buy Gertrude's handmade guitars here. Sales monthly!", "$$$");
        System.out.println(Gertrude);
    }

    @Test public void testAddReview() {
        Shop Gertrude = new Shop("Gertrude's Golly Guitars", "Buy Gertrude's handmade guitars here. Sales monthly!", "$$$");
        Gertrude.addReview(new Review("Great", "Vik", 4));
        System.out.println("Gertrude = " + Gertrude);
    }
}
