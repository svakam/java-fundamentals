package basiclibrary;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Lab03Test {
    @Test public void testUniqueWeatherData() {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        assertEquals("High: 72\nLow: 51\nNever saw temperature: 63\nNever saw temperature: 67\nNever saw temperature: 68\nNever saw temperature: 69\n", Lab03.rangeOfTempsAndUniqueValues(weeklyMonthTemperatures));
    }

    @Test public void testTallying() {
        ArrayList<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        String winner = Lab03.tally(votes);
        String test = winner + " received the most votes!";
        assertEquals("Bush received the most votes!", test);
    }
}
