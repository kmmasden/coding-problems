package solutions;

import java.util.Arrays;
import java.util.HashSet;

public class P345ReverseVowels {

    static final String VOWELS = "aeiouAEIOU";
    public static void main(String args[]) {

        System.out.println(reverseVowels("lEEtcOde"));

    }
    public static String reverseVowels(String s) {
        char[] chArr = s.toCharArray();
        int i = 0;
        int j = chArr.length - 1;

        //Two pointers to point at beginning and end of string
        while (i < j) {
            boolean iVowel = isVowel(chArr[i]);
            boolean jVowel = isVowel(chArr[j]);

            if (iVowel && jVowel) {
                //If both are vowels, swap values and i++, j--
                char temp = chArr[i];
                chArr[i] = chArr[j];
                chArr[j] = temp;
                i++;
                j--;
            } else if (iVowel && !jVowel) {
                //if i val is vowel but j is not, j--
                j--;
            } else if (!iVowel && jVowel) {
                //if i val is not val but j is, i++
                i++;
            } else {
                //if neither are vowels
                i++;
                j--;
            }
        }
        return new String(chArr);
    }

    public static boolean isVowel(char c) {
        return VOWELS.indexOf(c) != -1;
    }
}
