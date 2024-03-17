package solutions.neet150.twopointers;

import java.util.Arrays;

public class P167TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        //initialize two pointers, one at beginning of array and one at end
        int i = 0;
        int j = n - 1;

        int[] res = new int[2];

        while (i != j) {
            int sum = numbers[i] + numbers[j];

            //if the sum of values at i and j is equal to the target number, return answer. adding +1 as the problem arrays index starts at 1
            if (sum == target) {
                res[0] = i + 1;
                res[1] = j + 1;
                break;
            } else {
                //if the sum of the values at i and j positions is > target, j--
                if (sum > target) {
                    j--;
                } else {
                //if the sum of the value at i and j positions is < target, i++
                    i++;
                }
            }
        }
        return res;
    }

    public static void main(String args[]) {
        int[] arr = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr, 9)));
    }
}
