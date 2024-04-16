package CQ_L1.Recursion;

public class OneToN {
    public static void main(String[] args) {
        int n=10;
        PrintTillN(n,1);
    }

    private static void PrintTillN(int n,int i) {
        if(i > n)
            return;
        System.out.print(i+" ");
        PrintTillN(n,i+1);
    }
}
