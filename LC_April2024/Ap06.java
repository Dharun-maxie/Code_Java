package LC_April2024;


//  Minimum Remove to Make Valid Parentheses -> https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/
//  TOPICS -> String, Stack;

//Input: s = "lee(t(c)o)de)"
//Output: "lee(t(c)o)de"
//Explanation: "lee(t(co)de)" , "lee(t(c)ode)" would also be accepted.


public class Ap06 {
    public static void main(String[] args) {
        String s = "lee(t(c)o)de)";
        System.out.println(minRemoveToMakeValid(s));
    }
    public static String minRemoveToMakeValid(String s) {
        StringBuilder sb =new StringBuilder(s);

        for(int i=0; i< sb.length(); i++)
        {

        }

        return sb.toString();
    }
}
