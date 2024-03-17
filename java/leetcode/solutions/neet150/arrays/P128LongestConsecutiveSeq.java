package solutions.neet150.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class P128LongestConsecutiveSeq {
    public static int longestConsecutive(int[] nums) {
        //convert int array to set

        HashSet<Integer> set = Arrays.stream(nums)
                                        .boxed()
                                        .collect(Collectors.toCollection(HashSet::new));

        int longestSubseq = 0;

        //iterate through integer array and check if each element is the start of a subsequence (does not have a left neighbor)

        for (int num : nums) {
            //If beginning of subsequence
            if (!set.contains(num - 1)) {
                int length = 1;
                while (set.contains(num + length)) {
                    length++;
                }

                //compare length of current subsequence to longest

                longestSubseq = Math.max(longestSubseq, length);
            }
        }

        return longestSubseq;
    }

    public static void main (String args[]) {
        int[] arr = {100,4,200, 201, 202, 203,1,3,204, 2};
        System.out.println(longestConsecutive(arr));
    }
}
