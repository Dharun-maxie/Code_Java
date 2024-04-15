package CQ_L1.Recursion;

public class NumberOfStepReduceToZero {
    public static void main(String[] args) {
        int num=14;
        System.out.println(Rec(num,0));
    }
    private static int Rec(int num,int step)
    {
        if(num == 0)
            return step;
        return ((num&1) == 1)?Rec(num - 1, step+1):Rec(num/2,step+1) ;
    }
}
