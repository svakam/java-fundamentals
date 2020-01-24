package inheritance;

import org.junit.Test;

public class ReviewTest {
    @Test public void testConstructor() {
        Review reviewByVik = new Review(
                "This place had some delectable @$$ burgers. 12/10 would go back gahDAMN!111!11!!!", "Vik", 5);
        System.out.println(reviewByVik);
    }
}
