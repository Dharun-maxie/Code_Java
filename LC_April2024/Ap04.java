package LC_April2024;

//  Maximum Nesting Depth of the Parentheses -> [https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/]
//  TOPICS -> String, Stack.

public class Ap04 {
    public static void main(String[] args) {
        String s= "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
    }
    public static int maxDepth(String s) {
        int max_Depth=0;
        int currentDepth =0;
        for(char ch : s.toCharArray())
        {
            if(ch == '('){
                currentDepth++;
                max_Depth=Math.max(max_Depth,currentDepth);
            }
            else if(ch == ')')
                currentDepth--;
        }

        return max_Depth;
    }
}
