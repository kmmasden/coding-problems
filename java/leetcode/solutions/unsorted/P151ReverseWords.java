package solutions.unsorted;

public class P151ReverseWords {
    public static void main(String args[]) {
        String s = "   fly me   to   the moon  ";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        //Trim input string
        s = s.trim();

        //Split string into array on any number of whitespace characters
        String[] sArr = s.split("\s+");

        StringBuilder sb = new StringBuilder();

        //iterate backwards through string array to reverse word order and add spaces
        for (int i = sArr.length - 1; i > 0; i--) {
            sb.append(sArr[i]);
            sb.append(" ");
        }

        //last word, first in array index = 0 will not have a space appended so add separately
        sb.append(sArr[0]);

        return sb.toString();
    }
}
