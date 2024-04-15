package CQ_L1.Recursion;

import java.util.Arrays;

//  Sum triangle from array
//Given an array of integers, print a sum triangle from it such that the first level has all array elements.
//From then, at each level number of elements is one less than the previous level and elements at the level is being
//the Sum of consecutive two elements in the previous level.
//Example :
//Input : A = {1, 2, 3, 4, 5}
//Output : [48]
//         [20, 28]
//         [8, 12, 16]
//         [3, 5, 7, 9]
//         [1, 2, 3, 4, 5]
public class SumOfTriangle {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        PatternSumTriangle(array);
    }

    static void PatternSumTriangle(int[] array)
    {
        if( array.length < 1)
            return;
        int[] tempArray=new int[array.length-1];
        for (int i = 0; i < array.length-1; i++) {
            tempArray[i] = array[i]+array[i+1];
        }
        PatternSumTriangle(tempArray);
        System.out.println(Arrays.toString(array));
    }
}
