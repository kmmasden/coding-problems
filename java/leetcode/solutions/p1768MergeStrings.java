package solutions;

public class p1768MergeStrings {

    public static String mergeAlternately(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        int i = 0;
        int j = 0;

        StringBuilder merged = new StringBuilder();

        while (i < l1 && j < l2) {
            merged.append(word1.toCharArray()[i]);
            merged.append(word2.toCharArray()[j]);
            i++;
            j++;
        }

        if (i>= l1) {
            merged.append(word2.substring(j));
        } else {
            merged.append(word1.substring(i));
        }

        return merged.toString();
    }

    public static void main(String args[]) {
        String s1 = "abcdefg";
        String s2 = "pqrst";

        System.out.println(mergeAlternately(s1, s2));
    }
}
