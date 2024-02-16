package solutions;

import java.util.Arrays;

public class P58LengthLastWord {

    public static void main(String args[]) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        //Trim input string
        s = s.trim();

        //Split string into array on any number of whitespace characters
        String[] sArr = s.split("\s+");

        //return the length of the last String value in the array
        return sArr[sArr.length - 1].length();

    }

}
