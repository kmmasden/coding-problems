package solutions.unsorted;

public class P392IsSubsequence {

    public static void main(String args[]) {
        String s = "axc";
        String t = "ahbgcd";
        System.out.println(isSubsequence(s,t));
    }
    public static boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();

        int i = 0;
        int j = 0;

        while (i < n && j < m) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }

        if (i >= n) {
            return true;
        }
        return false;
    }
}
