package CQ_L1.Recursion;

public class StringManipulation {
    public static void main(String[] args) {
        String s="abcdadcba";
        char target='a';
        System.out.println(RecDeletion(s,target));
    }

    private static String RecDeletion(String s, char target) {
        if(s.isEmpty())
            return s;
        if( s.length() == 1 && s.charAt(0) != target)
            return s;
        if(s.charAt(0) == target)
            return STR."\{RecDeletion(s.substring(1), target)}";
        return s.charAt(0)+RecDeletion(s.substring(1), target);
    }
}
