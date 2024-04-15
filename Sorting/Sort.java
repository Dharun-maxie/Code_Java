package Sorting;

import javax.naming.InsufficientResourcesException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sort {
    public static void main(String[] args) {
        Sort obj=new Sort();
        int[] arr={6,9,2,3,1,4,8,7,5,10};
        System.out.println(Arrays.toString(arr));
        int[] ans=obj.Csort(arr);
        System.out.println(Arrays.toString(ans));
    }
    public int[] Bsort(int[] arr)
    {
        for(int i=0;i< arr.length;i++)
        {
            int check=0;
            for(int j=1;j<arr.length-i;j++)
            {
                if (arr[j-1] > arr[j])
                {
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    check++;
                }
            }
            if(check == 0)
                break;
        }
        return arr;
    }
    public int[] Ssort(int[] arr)
    {
        for(int i=0;i< arr.length-1;i++)
        {
            int MinIndex=i;
            for(int j=i+1;j< arr.length;j++)
            {
                if (arr[MinIndex] > arr[j])
                {
                    MinIndex=j;
                }
            }
            int temp=arr[MinIndex];
            arr[MinIndex]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
    public int[] Isort(int[] arr)
    {
        for (int i = 1; i < arr.length ; i++) {
            int elem=arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > elem)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=elem;
        }
        return arr;
    }

    public void Qsort(int[] arr,int l,int h)
    {
        if(l>h)
            return;

        int partion=Partion(arr,l,h);

        Qsort(arr, l, partion-1);
        Qsort(arr, partion+1, h);
    }

    private static int Partion(int[] arr, int l, int h) {
        int low=l-1;
        for(int i=l;i<h;i++)
        {
            if(arr[h] > arr[i]) {
                low++;
                int temp = arr[i];
                arr[i] = arr[low];
                arr[low] = temp;
            }

        }
        int temp=arr[low+1];
        arr[low+1]=arr[h];
        arr[h]=temp;

        return low+1;
    }

    public int[] Msort(int[] arr)
    {
        if(arr.length == 1 || arr.length == 0)
            return arr;

        int m= arr.length/2;

        int[] F = Msort(Arrays.copyOfRange(arr,0,m));
        int[] S = Msort(Arrays.copyOfRange(arr,m,arr.length));

        return MergeArray(F,S);
    }

    private int[] MergeArray(int[] f, int[] s) {
        int[] Ans=new int[f.length+s.length];

        int FIndex=0,SIndex=0,AIndex = 0;

        while(FIndex < f.length && SIndex < s.length)
        {
            if(f[FIndex] < s[SIndex])
            {
                Ans[AIndex] = f[FIndex];
                FIndex++;
            }
            else
            {
                Ans[AIndex] = s[SIndex];
                SIndex++;
            }
            AIndex++;
        }
        while(FIndex < f.length)
            Ans[AIndex++] = f[FIndex++];
        while(SIndex < s.length)
            Ans[AIndex++] = s[SIndex++];

        return Ans;
    }
    // Count Sort is Only Optimal for Smaller Number Because Of The Memory Consumption.
    public  int[] Csort(int[] x)
    {
        if(x.length == 0)
            return new int[]{};
        int min = Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int i:x) {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }

        Map<Integer,Integer> map =new HashMap<>();

        for (int j : x)
            map.put(j,map.getOrDefault(j,0)+1);

        int index=0;
        for (int i = min; i<= max;i++) {
            int count = map.getOrDefault(i,0);
            while(count > 0)
            {
                x[index]=i;
                count--;
                index++;
            }
        }
        return x;
    }
    
}
