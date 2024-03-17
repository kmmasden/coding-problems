package solutions.unsorted;

import java.util.Arrays;

public class P643MaxAvgSubarray {

    public static void main(String args[]) {
        int[] arr = {1,12,-5,-6,50,3};

        int[] arr1 = {-1};

        System.out.println(findMaxAverage(arr, 4));
    }

    public static double findMaxAverage(int[] nums, int k) {
        int n = nums.length;

        //inital values for sliding window pointers
        int left = 0;
        int right = k - 1;

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;
        left++;
        right++;
        while (right < n) {
            sum += nums[right];
            sum -= nums[left-1];

            maxSum = Math.max(maxSum, sum);
            left++;
            right++;
        }
        return maxSum / (double) k;
    }
}
