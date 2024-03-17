package solutions.unsorted;

import java.util.HashMap;
import java.util.HashSet;

public class P1207UniqueOccurances {

    public static void main(String args[]) {
        int[] arr = {1,2,2,2,1,1,3};
        System.out.println(uniqueOccurrences(arr));
    }

    //Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.

    public static boolean uniqueOccurrences(int[] arr) {
        //Count number of occurances of each key value with HashMap
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (Integer i : arr) {
            if (countMap.containsKey(i)) {
                countMap.put(i, countMap.get(i) + 1);
            } else {
                countMap.put(i, 1);
            }
        }

        //Iterate through map and check if value is repeated
        //Using HashSet to check for duplicate

        HashSet<Integer> countSet = new HashSet<>();

        for (Integer i : countMap.values()) {
            if (!countSet.add(i)) {
                return false;
            }
        }

        return true;
    }

}
