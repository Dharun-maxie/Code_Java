package LC_April2024;

//  Valid Parenthesis String -> https://leetcode.com/problems/valid-parenthesis-string/
//  TOPICS -> String, Dynamic Programming, Stack, Greedy.

public class Ap07 {
    public static void main(String[] args) {
        System.out.println(checkValidString("(*))))((()"));
    }
    public static boolean checkValidString(String s) {
        int minOpen = 0, maxOpen = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                minOpen++;
                maxOpen++;
            } else if (c == ')') {
                minOpen = Math.max(minOpen - 1, 0);
                maxOpen--;
                if (maxOpen < 0) return false;
            } else { // '*'
                minOpen = Math.max(minOpen - 1, 0);
                maxOpen++;
            }
        }

        return minOpen == 0;
    }
}
