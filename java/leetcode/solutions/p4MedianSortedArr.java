package solutions;

import java.util.Arrays;

public class p4MedianSortedArr {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int mergedSize = n+m;

        int[] mergedArr = new int[mergedSize];

        //pointers
        int i = 0;
        int j = 0;

        //fill merged array
        for (int x = 0; x < mergedSize; x++) {
            if (i != n && j != m) {
                if (nums1[i] <= nums2[j]) {
                    mergedArr[x] = nums1[i];
                    i++;
                } else {
                    mergedArr[x] = nums2[j];
                    j++;
                }
            } else {
                if (i == n) {
                    mergedArr[x] = nums2[j];
                    j++;
                } else if (j == m) {
                    mergedArr[x] = nums1[i];
                    i++;
                }
            }
        }

        return getMedianOfArray(mergedArr);
    }

    public static double getMedianOfArray(int[] arr) {
        double median = 0;
        int n = arr.length;

        if (n%2 == 0) {
            int x = n/2;
            median = (arr[x - 1] + arr[x]) / (double) 2;
        } else {
            int x = (n-1)/2;
            median = arr[x];
        }
        return median;
    }

    public static void main(String args[])  {
        int[] nums1 = {-1, 3, 15, 16, 20};
        int[] nums2 = {1, 2, 3, 5, 9};

        System.out.println(findMedianSortedArrays(nums1, nums2));

    }
}
