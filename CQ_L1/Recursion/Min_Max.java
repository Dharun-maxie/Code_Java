package CQ_L1.Recursion;

//  Recursive Programs to find Minimum and Maximum elements of array
//Given an array of integers arr, the task is to find the minimum and maximum element of that array using recursion.
//Examples :
//
//Input: arr = {1, 4, 3, -5, -4, 8, 6};
//Output: min = -5, max = 8
//
//Input: arr = {1, 4, 45, 6, 10, -8};
//Output: min = -8, max = 45

public class Min_Max {
    public static void main(String[] args) {
        int[] array={2,3,4,10,6,1,8,7,9};

        System.out.println(RecMin(array, array.length));
        System.out.println(RecMax(array, array.length));
    }
    static int RecMin(int[] x,int index)
    {
        if(index == 1)
            return x[0];
        return Math.min(x[index-1] , RecMin(x,index-1));
    }
    static int RecMax(int[] x, int index)
    {
        if(index == 1)
            return x[0];
        return Math.max(x[index-1], RecMax(x, index-1));
    }

}
