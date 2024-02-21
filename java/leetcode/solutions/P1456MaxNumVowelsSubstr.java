package solutions;

public class P1456MaxNumVowelsSubstr {

    static final String VOWELS = "aeiou";
    public static void main(String args[]) {
        String s = "abciiidef";
        System.out.println(maxVowels(s, 3));
    }
    public static int maxVowels(String s, int k) {
        int n = s.length();

        //Sliding window initial pointer values
        int left = 0;
        int right = k-1;

        //find number of vowels in starting window
        int vowelCount = 0;
        for (int i=0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                vowelCount++;
            }
        }

        int maxVowels = vowelCount;
        //increment window
        left++;
        right++;

        while (right < n) {
            if (isVowel(s.charAt(left - 1))) {
                vowelCount--;
            }

            if (isVowel(s.charAt(right))) {
                vowelCount++;
            }

            maxVowels = Math.max(maxVowels, vowelCount);

            left++;
            right++;
        }

        return maxVowels;
    }

    public static boolean isVowel(char c) {
        return VOWELS.indexOf(c) != -1;
    }


}
