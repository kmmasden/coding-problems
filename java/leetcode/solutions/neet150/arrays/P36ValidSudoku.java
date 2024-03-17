package solutions.neet150.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class P36ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        //create three maps to represent rows, columns and squares
        Map<Integer, Set<Integer>> rows = new HashMap<>();
        Map<Integer, Set<Integer>> cols = new HashMap<>();
        Map<String, Set<Integer>> sqs = new HashMap<>();


        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] != '.') {
                    //if square contains a value
                    int value = board[row][col] - '0';

                    rows.computeIfAbsent(row, k -> new HashSet<>());
                    if (!rows.get(row).add(value)) return false;

                    cols.computeIfAbsent(col, k -> new HashSet<>());
                    if (!cols.get(col).add(value)) return false;

                    StringBuilder sb = new StringBuilder();
                    sb.append(String.valueOf(row/3));
                    sb.append(String.valueOf(col/3));
                    String key = sb.toString();

                    sqs.computeIfAbsent(key, k -> new HashSet<>());
                    if (!sqs.get(key).add(value)) return false;

                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        char[][] sudokuBoard = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println(isValidSudoku(sudokuBoard));
    }
}
