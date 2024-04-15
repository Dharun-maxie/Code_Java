package CQ_L1.Fuctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//  [Write a function that returns all prime numbers between two given numbers.]
//  (https://www.geeksforgeeks.org/program-to-find-prime-numbers-between-given-interval/)
public class Prime {
    public static void main(String[] args) {
        int s = 1;
        int e = 1000;

        List<Integer> list = new ArrayList<>();

        for (int i = s; i < e; i++) {
            if (isPrime(i))
                list.add(i);
        }
        System.out.println(list.size());

        boolean[] marked = new boolean[e-s+1];
        Arrays.fill(marked, false);
        System.out.println(PrimeNumberInRange(e,marked).size());
    }

    //SIEVE Method

    // O(N(log(log(N)) -> Time
    // 0(N) -> Space
    static List<Integer> PrimeNumberInRange(int e, boolean[] marked)
    {
        for (int i =2; i*i < e; i++) {
            if(!marked[i])
            {
                for (int j = i*2; j < e; j+=i) {
                    marked[j] = true;
                }
            }
        }
        List<Integer> list=new ArrayList<>();
        for (int i = 2; i < e; i++) {
            if(!marked[i])
                list.add(i);
        }

        return list;
    }

    // Normal Method

    // O(N(sqrt(N)) -> Time
    // 0(1) -> Space
    private static boolean isPrime(int i) {
        if(i<=1)
            return false;
        int j=2;
        while(j*j <= i)
        {
            if(i%j == 0)
                return false;
            j++;
        }
        return true;
    }
}