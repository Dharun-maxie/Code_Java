package Tree.Heaps;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Integer[] arr = {9, 8, 3, 6, 5, 12, 14, 7, 2, 1, 10, 11, 15, 4, 13};

//        String[] arr = {"b","d","m","v","f","z","u","h","o","r","a"};

        Heap<Integer> obj =new Heap<>();

        obj.Insert(arr);

        ArrayList list = obj.HeapSort();

        System.out.println(list);
    }
}
