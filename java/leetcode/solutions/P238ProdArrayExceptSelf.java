package solutions;

import java.util.Arrays;

public class P238ProdArrayExceptSelf {

    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4};

        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] answer = new int[n];

        int pre = 1;
        int suf = 1;

        for (int i = 0; i < n; i++) {
            answer[i] = pre;
            pre *= nums[i];
        }

        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= suf;
            suf *= nums[i];
        }
        return answer;
    }

}
