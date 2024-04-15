package CQ_L1.Recursion;

import java.io.IOException;
import java.util.*;
class Fact {

    /*
     * Complete the 'factorial' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int factorial(int n) {
        if(n<2)
            return 1;
        return n*factorial(n-1);
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);

        int n=scan.nextInt();

        int result = Fact.factorial(n);

        System.out.println(result);

        scan.close();
    }
}

