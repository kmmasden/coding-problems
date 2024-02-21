package solutions;

import java.util.*;

public class P2215DiffTwoArrays {

    public static void main(String args[]) {
        int[] nums1 = {1,2,3,3};
        int[] nums2 = {1,1,2,2};

        System.out.println(findDifference(nums1, nums2));
    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Set<Integer> s1 = returnSetFromArr(nums1);
        Set<Integer> s2 = returnSetFromArr(nums2);

        Set<Integer> s1Temp = returnSetFromArr(nums1);

        s1.removeAll(s2);
        s2.removeAll(s1Temp);

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>(s1));
        result.add(new ArrayList<>(s2));

        return result;
    }

    public static Set<Integer> returnSetFromArr(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();

        for (int i : nums) {
            set.add(i);
        }

        return set;
    }
}
