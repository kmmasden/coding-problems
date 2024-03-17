package solutions.neet150.twopointers;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P15ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        //Sort array in ascending order
        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

        //length of array
        int n = nums.length;

        //new list for result
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < n-2; i++ ) {
            //Initialize two sum solution for rest of right array
            int a = nums[i];

            if (i > 0 && (nums[i-1] == a)) {
            //if previous value is equal to current value, skip to avoid duplicate answers
                System.out.printf("%d and %d are same, skip\n", nums[i-1], a);
                continue;
            }

            int j = i + 1;
            int k = n - 1;

            int b = nums[j];
            int c = nums[k];
            System.out.printf("i: %d, j:%d, k:%d\t a:%d b:%d c:%d\n", i,j,k, a,b,c);

            while (j < k) {
                int sum = a + b + c;
                System.out.printf("\t\tsum:%d\n", sum);

                //if the sum of values at i and j is equal to the target number, return answer. adding +1 as the problem arrays index starts at 1
                if (sum == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    res.add(list);
                    j++;
                } else {
                    if (sum > 0) {
                        k--;
                    } else {
                        j++;
                    }
                }
            }

        }
        return res;
    }

    public static void main(String args[]) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));
    }
}
