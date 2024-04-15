package LC_April2024;

//  Length Of Last Word -> [https://leetcode.com/problems/length-of-last-word/]
//  TOPICS -> String.
public class Ap01 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord(
                "Hello, My Name Is Dharun I Love Coding."
        ));
    }
    public static int lengthOfLastWord(String s) {
        String[] ans=s.split(" ");
        return ans[ans.length -1].length();
    }
}
