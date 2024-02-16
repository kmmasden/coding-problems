package solutions;

public class P125ValidPalindrome {

    public static boolean isPalindrome(String s) {
        //remove all nonalphanumeric characters
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        //convert to lowercase
        s = s.toLowerCase();

        int length = s.length();

        if (s.isEmpty() || length < 2) {
            return true;
        }

        char[] cArr = s.toCharArray();

        int iterations = length % 2 == 0 ? length/2 : (length - 1) / 2;

        int i = 0;
        int j = length - 1;

        while (i < iterations) {
            if (cArr[i] != cArr[j]) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static void main(String args[]) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
