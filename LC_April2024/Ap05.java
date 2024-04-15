package LC_April2024;

//  Make The String Great -> https://leetcode.com/problems/make-the-string-great/
//  TOPICS -> String, Stack.

import java.util.Stack;

public class Ap05 {
    public static void main(String[] args) {
        String s="leEeetcode";
        System.out.println(makeGood(s));
    }
    public static String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && (ch == stack.peek() + 32 || ch == stack.peek() - 32)) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.reverse().toString();
    }
}
