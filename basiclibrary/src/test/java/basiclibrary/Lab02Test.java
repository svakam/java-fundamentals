package basiclibrary;

import org.junit.Test;
import static org.junit.Assert.*;

public class Lab02Test {
    @Test public void testRoll() {
        // test if dice rolls are values between 1 and 6 inclusive
        int lengthArray4Rolls = Lab02.roll(4).length;
        for (int i = 0; i < lengthArray4Rolls; i++) {
            int numberInArray = Lab02.roll(4)[i];
            assertTrue(numberInArray > 1 && numberInArray < 6);
        }

        // test 4 rolls length
        int expectedLength = 4;
        assertTrue(expectedLength == lengthArray4Rolls);

        // test 6 rolls length
        int expectedLength2 = 6;
        int actualLength2 = Lab02.roll(6).length;
        assertTrue(expectedLength2 == actualLength2);

        // test 0 rolls length
        int expectedLength3 = 0;
        int actualLength3 = Lab02.roll(0).length;
        assertTrue(expectedLength3 == actualLength3);
    }

    @Test public void testContainsDuplicates() {
        // test true for duplicate values in array
        int[] duplicateArray = {1,2,3,4,4,6};
        assertTrue(Lab02.containsDuplicates(duplicateArray));
        int[] duplicateArray2 = {0,0,5,5,10,15};
        assertTrue(Lab02.containsDuplicates(duplicateArray2));

        // test false for unique values in array or empty array
        int[] uniqueArray = {1,2,3,4,5,6};
        assertFalse(Lab02.containsDuplicates(uniqueArray));
        int[] uniqueArray2 = {};
        assertFalse(Lab02.containsDuplicates(uniqueArray2));
    }

    @Test public void testAverage() {
        // happy path
        int[] array1 = {1,2,3,4,5,6};
        double expected = 3.5;
        assertTrue(Lab02.calculateAverageOfInts(array1) == expected);

        // fail path
//        int[] array2 = {};
//        assertTrue(Lab02.calculateAverageOfInts(array2).isNaN());

        // edge
        int[] array3 = {0,0,0,0,0,0};
        double expected3 = 0;
        assertTrue(Lab02.calculateAverageOfInts(array3) == expected3);
    }

    @Test public void testArrayOfArrays() {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int[] lowestAvgArray = {55, 54, 60, 53, 59, 57, 61};
        for (int i = 0; i < Lab02.findLowestAverage(weeklyMonthTemperatures).length; i++) {
            System.out.println(Lab02.findLowestAverage(weeklyMonthTemperatures)[i]);
        }
        // can't figure out why this is giving me a false - the above for loop prints the expected array
        assertTrue(Lab02.findLowestAverage(weeklyMonthTemperatures) == lowestAvgArray);
    }
}
