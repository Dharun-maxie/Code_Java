package CQ_L1.Fuctions;

public class Factorials {
    public static void main(String[] args) {
        int num=5;
        System.out.println(Factorial(5));
    }
    static int Factorial(int num)
    {
        int Fact=num;
        for (int i = num -1; i > 0; i--) {
            int sum=0;
            for (int j = 0; j < i; j++) {
                sum+=Fact;
            }
            Fact=sum;
        }
        return Fact;
    }
}
