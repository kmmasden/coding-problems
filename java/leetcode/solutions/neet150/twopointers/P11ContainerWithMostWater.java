package solutions.neet150.twopointers;

public class P11ContainerWithMostWater {
    public static int maxArea(int[] height) {
        //initialize two pointers at start and end of array
        int n = height.length;

        int l = 0;
        int r = n - 1;

        int maxArea = 0;

        while (l < r) {
            int lh = height[l];
            int rh = height[r];
            //check the area
            int area = Math.min(lh, rh) * (r-l);

            if (maxArea < area) maxArea = area;

            if (lh < rh) {
                l++;
            } else {
                r--;
            }
        }

        return maxArea;
    }

    public static void main(String args[]) {
        int[] hArr = {1,8,6,2,5,4,8,3,7};

        System.out.println(maxArea(hArr));
    }
}
