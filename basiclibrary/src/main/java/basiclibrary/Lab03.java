package basiclibrary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Lab03 {
    // take in weekly month temps (array of arrays)
    public static String rangeOfTempsAndUniqueValues(int[][] arrayOfArrays) {
        // use hashset Integer to track unique temps seen
        HashSet<Integer> findTempsInRangeNotRecorded = new HashSet<>();

        // iterate through data to find min and max values
        int maxTemp = -200;
        int minTemp = 200;
        for (int[] subArray : arrayOfArrays) {
            for (int temp : subArray) {
                if (temp > maxTemp) {
                    maxTemp = temp;
                } else if (temp < minTemp) {
                    minTemp = temp;
                }
                // for each temp, check against hashset; if not added, add
                findTempsInRangeNotRecorded.add(temp);
            }
        }
        String stringSoFar = "High: " + maxTemp + "\nLow: " + minTemp + "\n";

        // iterate through range of temps
        for (int recordCheck = minTemp; recordCheck < maxTemp; recordCheck++) {
            // if temp at given part of range doesn't exist in hashset, print that value
            if (!findTempsInRangeNotRecorded.contains(recordCheck)) {
                stringSoFar += "Never saw temperature: " + recordCheck + "\n";
            }
        }
        return stringSoFar;
    }

    public static void tally(ArrayList<String> namesVotedFor) {
        HashMap<String,Integer> namesAndVotes = new HashMap<>();
        namesVotedFor.forEach(name -> {
            if (!namesAndVotes.containsKey(name)) {
                namesAndVotes.put(name, 0);
            } else {
                int votesForName = namesAndVotes.get(name);
                namesAndVotes.put(name, votesForName + 1);
            }
        });
        // get counts of all votes for each name
        for (int name = 0; name < namesAndVotes.keySet().size(); name++) {
            namesAndVotes.get(name);
        }
        namesAndVotes.forEach(name, value -> {
            System.out.println("name = " + name);
        });
    }
}
