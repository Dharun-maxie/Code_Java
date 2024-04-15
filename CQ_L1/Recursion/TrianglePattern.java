package CQ_L1.Recursion;

public class TrianglePattern {
    public static void main(String[] args) {
        pattern1(4,0);
    }
    static void pattern1(int r,int c)
    {
        if(r==0)
            return;

        if(c<r) {
            pattern1(r,c+1);
            System.out.print("*");
        }
        else
        {
            pattern1(r-1,0);
            System.out.println();
        }
    }
}
