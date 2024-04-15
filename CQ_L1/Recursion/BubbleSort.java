package CQ_L1.Recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array={6,5,4,3,2,1,9,8,7};
//        RecBSort(array,array.length-1,0);
        RecSSort(array, array.length,0,0);
        System.out.println(Arrays.toString(array));

    }

    private static void RecBSort(int[] array,int r,int c) {
        if(r == 0)
            return;
        if(c<r)
        {
            if(array[c] > array[c+1])
            {
                int temp=array[c];
                array[c]=array[c+1];
                array[c+1]=temp;
            }
            RecBSort(array, r, c+1);
        }
        else
            RecBSort(array, r-1, 0);
    }

    static void RecSSort(int[] array,int r,int c,int iMax)
    {
        if(r==0)
            return;

        if(c<r){
            if ((array[c] > array[iMax])) {
                RecSSort(array, r, c + 1, c);
            } else {
                RecSSort(array, r, c + 1, iMax);
            }
        }
        else{
            int temp=array[iMax];
            array[iMax]=array[r-1];
            array[r-1]=temp;

            RecSSort(array,r-1,0,0);
        }
    }
}
