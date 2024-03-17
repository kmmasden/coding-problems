package solutions.unsorted;

import java.util.Arrays;

public class P283MoveZeroes {

    public static void main(String args[]) {
        int[] arr = {3, 0, 4};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void moveZeroes(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return;
        }

        int i = 0;
        int j = 1;

        while ( j < n) {
            int x = nums[i];
            int y = nums[j];

            if (x != 0 && y!=0) {
                i++;
                j++;
            } else if (x != 0 && y == 0) {
                i++;
                j++;
            } else if (x == 0 && y != 0) {
                swap(nums, i, j);
                i++;
                j++;
            } else {
                j++;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
