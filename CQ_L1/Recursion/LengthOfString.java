package CQ_L1.Recursion;

public class LengthOfString {
    public static void main(String[] args) {
        String name ="Dharunpandi";
        System.out.println(Slen(name));
    }

    private static int Slen(String name) {
        if(name.isEmpty())
            return 0;
        return Slen(name.substring(1))+1;
    }
}
