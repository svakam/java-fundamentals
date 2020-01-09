package basiclibrary;

public class Lab02 {
    public static int[] roll(int n) {
        int[] diceRolls = new int[n];
        int min = 1;
        int max = 6;
        int range = max - min + 1;
        for (int i = 0; i < n; i++) {
            int roll = (int) (Math.random() * range) + min;
            diceRolls[i] = roll;
        }
        return diceRolls;
    }

    public static boolean containsDuplicates(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int tempStorageOfValueFromArray = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == tempStorageOfValueFromArray) {
                    return true;
                }
            }
        }
        return false;
    }

    public static double calculateAverageOfInts(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public static int[] findLowestAverage(int[][] arrayOfArrays) {
        double smallestAverage = calculateAverageOfInts(arrayOfArrays[0]);
        int[] smallestAvgArray = arrayOfArrays[0];
        for (int i = 0; i < arrayOfArrays.length; i++) {
            double averageSoFar = calculateAverageOfInts(arrayOfArrays[i]);
            if (averageSoFar < smallestAverage) {
                smallestAverage = averageSoFar;
                smallestAvgArray = arrayOfArrays[i];
            }
        }
        return smallestAvgArray;
    }
}
