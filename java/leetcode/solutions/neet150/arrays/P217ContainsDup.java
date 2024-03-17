package solutions.neet150.arrays;
import java.util.*;

public class P217ContainsDup {

    //Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

    public static void main(String args[]) {

    }
    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (Integer i : nums) {
            if (map.containsKey(i)) {
                return true;
            } else {
                map.put(i, 1);
            }
        }

        return false;
    }

}
