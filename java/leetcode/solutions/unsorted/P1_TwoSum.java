package solutions.unsorted;

import java.util.HashMap;
import java.util.Map;

public class P1_TwoSum {
    public int[] twoSum(int[] nums, int target) {

        //Add to hashmap key- num, value - index
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        //new array for result
        int[] res = new int[2];

        //loop through nums array and see if the needed value for target sum exists and is not the nums value
        for (int i = 0; i < nums.length; i ++) {
            int val = nums[i];
            int need = target - val;

            if (map.containsKey(need) && map.get(need) != i) {
                res[0] = i;
                res[1] = map.get(need);
            }
        }

        return res;
    }
}
