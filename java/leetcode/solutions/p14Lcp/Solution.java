package solutions.p14Lcp;

import java.util.Arrays;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        String longest = "";

        int shortestStrLength = lengthOfShortestString(strs);

        System.out.println("Shortest String: " + shortestStrLength);
        if (shortestStrLength == 0) {
            return longest;
        }

        for (int i=0; i<shortestStrLength; i++) {
            System.out.println("i:" + i);
            char c = strs[0].charAt(i);
            if (allPositionsSame(strs, i, c)) {
                longest += c;
            } else {
                return longest;
            }
        }

        return longest;
    }

    private int lengthOfShortestString(String[] strs) {
        int length = 200;

        for (String s : strs ) {
            if (s.isEmpty()) {
                return 0;
            }

            if (s.length < length) {
                length = s.length();
            }
        }
        return length;
    }


    private boolean allPositionsSame(String[] strs, int pos, char c) {
        for (String s : strs) {
            if (s.charAt(pos) != c) {
                return false;
            }
        }
        return true;
    }
}
