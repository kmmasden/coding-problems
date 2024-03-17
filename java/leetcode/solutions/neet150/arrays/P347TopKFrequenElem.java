package solutions.neet150.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P347TopKFrequenElem {

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> count = new HashMap<>();
        //count the occurrances for each integer in nums array
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        //the maximum amount a number could occur in nums array is equal to the size of the nums array
        int maxCount = nums.length;

        //Initialize a new array of size equal to nums.length; the index of this array represents the
        List<Integer>[] countArray = new ArrayList[maxCount + 1];

        for (int key : count.keySet()) {
            int freq = count.get(key);

            if (countArray[freq] == null) {
                countArray[freq] = new ArrayList<>();
            }
                countArray[freq].add(key);
        }

        //iterate backwards through countArray to get k terms

        int[] result = new int[k];
        int i = 0;

        for (int j = maxCount; j >= 0; j--) {
            if (countArray[j] != null) {
                for (int val : countArray[j]) {
                    result[i] = val;
                    i++;

                    //if i == k then k number of values have been found
                    if (i == k) {
                        return result;
                    }
                }
            }
        }
        return result;
    }
}
