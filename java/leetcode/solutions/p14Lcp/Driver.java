package solutions.p14Lcp;

import java.util.Arrays;

public class Driver {
    public static void main(String args[]) {
        Solution solution = new Solution();
        String[] strs = {"flower", "flow", "flight", "flick"};
        String[] strs2 = {""};
        String[] strs3 = {"a"};
        String[] strs4 = { "a", ""};


//        System.out.println(solution.longestCommonPrefix(strs));
//        System.out.println(solution.longestCommonPrefix(strs2));
        System.out.println(solution.longestCommonPrefix(strs3));
        System.out.println(solution.longestCommonPrefix(strs4));


    }
}
