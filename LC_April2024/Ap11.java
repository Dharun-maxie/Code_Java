package LC_April2024;

//  Remove K Digits -> https://leetcode.com/problems/remove-k-digits/
//  Topics -> String, Stack, Greedy, Monotonic Stack

import java.util.Stack;

public class Ap11 {
    public static void main(String[] args) {
        System.out.println(removeKdigits("1432219", 3));
        System.out.println(removeKdigits("10200", 1));
    }
    public static String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        for (char digit : num.toCharArray()) {

            while (k > 0 && !stack.isEmpty() && stack.peek() > digit) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }

        while (k > 0) {
            stack.pop();
            k--;
        }

        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }
        while (result.length() > 1 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }
        return result.isEmpty() ? "0" : result.toString();
    }
}
