package solutions;

import java.util.HashMap;

public class P383Ransom {

    public static boolean canConstruct(String ransomNote, String magazine) {
        //If magazine str length is less than ransom note than automatically, we cannot construct
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        //Count letters of each string, ransomNote and magazine.
        HashMap<Character, Integer> ransomMap = createHashMapOfLetters(ransomNote);
        HashMap<Character, Integer> magMap = createHashMapOfLetters(magazine);

        //Then loop through key values of ransom note and if magazine map also contains all same letters and >= value, then can construct
        for (Character c : ransomMap.keySet()) {
            //Check if magazine has key value; if not, cannot construct
            if (!magMap.containsKey(c)) {
                return false;
            }

            if (magMap.get(c) < ransomMap.get(c)) {
                return false;
            }
        }
        return true;
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

    public static void main(String args[]) {
        System.out.println(canConstruct("abcaa", "bccbbaaa"));
    }
}
