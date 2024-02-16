package solutions;

import java.util.HashMap;

public class P242ValidAnagram {

    public static void main (String args[]) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        //Check if strings are same length, if not, not anagrams
        if (s.length() != t.length()) {
            return false;
        }
        //Find counts of each string with hashmap
        HashMap<Character, Integer> sMap = createHashMapOfLetters(s);
        HashMap<Character, Integer> tMap = createHashMapOfLetters(t);

        //If key and value pairs match in both hashmaps they are anagrams, if not, they are not
        return sMap.equals(tMap);
    }

    public static HashMap<Character, Integer> createHashMapOfLetters(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (Character c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        return map;
    }
}
