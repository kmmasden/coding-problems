package solutions.neet150.arrays;

import java.util.*;

public class P49GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {

        //Have a Map with key as letter count and value as a list of the strings that have that count
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                int val = c - 'a';
                count[val]++;
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                if (count[i] > 0) {
                    sb.append(String.valueOf(i));
                    sb.append("#");
                    sb.append(count[i]);
                }
            }

            String key = sb.toString();
            //check if map contains key
            if (map.containsKey(key)) {
                map.get(key).add(s);
            } else {
                map.put(key, new ArrayList<>(Arrays.asList(s)));
            }
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String args[]) {
        String[] strs = {"bark", "rabk", "abc", "cba"};
        System.out.println(groupAnagrams(strs));
    }
}
