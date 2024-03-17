package solutions.neet150.twopointers;

public class P42TrappingRainWater {
    public static int trap(int[] height) {
        int n = height.length;

        //Amount of water at index i, min(maxL, maxR) - height[i]

        //Initialize 3 arrays to represent max value to the left of each index, max val right, and min(maxL,maxR)
        //size is equal to the number of elements in height array

        int[] maxL = new int[n];
        int[] maxR = new int[n];

        //loop through and find the max value to the left of each index
        int max = 0;
        for (int i = 0; i < n; i++) {
            maxL[i] = max;
            if (height[i] > max) {
                max = height[i];
            }
        }

        //loop through and find the max value to the right of each index
        max = 0;
        for (int i = n-1; i >= 0; i--) {
            maxR[i] = max;
            if (height[i] > max) {
                max = height[i];
            }
        }

        //find the minimum value for each index
        int res = 0;
        for (int i = 0; i < n; i++) {
            int min = Math.min(maxL[i], maxR[i]);

            int amt = min - height[i];
            if (amt < 0) amt = 0;

            res += amt;

        }
        return res;
    }

    public static void main(String args[]) {
        int[] hArr = {0,1,0,2,1,0,1,3,2,1,2,1};

        System.out.println(trap(hArr));
    }
}
