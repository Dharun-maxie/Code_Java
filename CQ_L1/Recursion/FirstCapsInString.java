package CQ_L1.Recursion;

//  First uppercase letter in a string (Iterative and Recursive)
//Given a string find its first uppercase letter
//Examples :
//
//Input : geeksforgeeKs
//Output : K
//
//Input  : geekS
//Output : S
public class FirstCapsInString {
    public static void main(String[] args) {
        String str = "geeksforgeeKs";

        System.out.println(Rec(str,0));
    }

    private static char Rec(String str,int i) {
        if(str.length() == i)
            return ' ';
        if(Character.isUpperCase(str.charAt(i)))
            return str.charAt(i);
        return Rec(str,i+1);
    }
}
