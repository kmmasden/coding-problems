package solutions.unsorted;

import java.util.HashMap;

public class P169MajorityElement {

    public static void main(String args[]) {
        int[] arr = {2,2,1,1,1,2,2};
        majorityElement(arr);
    }

    public static int majorityElement(int[] nums) {
        double majorityCount = Math.floor(nums.length / (double) 2);
        System.out.println("mcount:"+ majorityCount);

        //Use Map to find number of occurances
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (Integer i : nums) {
            if (countMap.containsKey(i)) {
                countMap.put(i, countMap.get(i) + 1);
            } else {
                countMap.put(i, 1);
            }
        }

        System.out.println(countMap);

        for(Integer i : countMap.keySet()) {
            if (countMap.get(i) > (int) majorityCount) {
                return i;
            }
        }

        return 0;
    }

}
