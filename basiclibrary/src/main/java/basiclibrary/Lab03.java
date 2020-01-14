package basiclibrary;

import java.util.*;

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

    public static String tally(ArrayList<String> namesVotedFor) {
        // declare new hashmap and input names and votes
        HashMap<String,Integer> namesAndVotes = new HashMap<>();
        namesVotedFor.forEach(name -> {
            if (!namesAndVotes.containsKey(name)) {
                namesAndVotes.put(name, 0);
            } else {
                int votesForName = namesAndVotes.get(name);
                namesAndVotes.put(name, votesForName + 1);
            }
        });

        // find which name has the most votes
        String[] names = namesAndVotes.keySet().toArray(new String[0]);
        int mostVotes = 0;
        String nameOfMostVotes = "";
        for (String name : names) {
            int votesForName = namesAndVotes.get(name);
            if (mostVotes < votesForName) {
                mostVotes = votesForName;
                nameOfMostVotes = name;
            }
        }
        return nameOfMostVotes;
    }
}
