package Sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {

    Sort obj;

    @BeforeEach
    void OBJ()
    {
       obj=new Sort();
    }

    @Test
    void bsort() {
        System.out.println("B_Sort Case");
        assertArrayEquals(new int[] {1,2,3,4,5,6,8,9,10},obj.Bsort(new int[] {9,10,6,5,4,3,2,1,8}));
        System.out.println("Test Case Passed");

        assertArrayEquals(new int[] {}, obj.Bsort(new int[] {}));
        System.out.println("Test Case Passed (Empty List)");

        assertArrayEquals(new int[] {1,2,3}, obj.Bsort(new int[] {1,2,3}));
        System.out.println("Test Case Passed (Already Sorted List)");

        assertArrayEquals(new int[] {-2, -1, 0, 1, 2}, obj.Bsort(new int[] {2, 1, 0, -1, -2}));
        System.out.println("Test Case Passed (Reverse Sorted)");

        assertArrayEquals(new int[] {1, 1, 2, 3, 3}, obj.Bsort(new int[] {3, 1, 3, 2, 1}));
        System.out.println("Test Case Passed (Duplicates)");

        int[] randomList = generateRandomList(100);
        int[] sortedRandomList = randomList.clone();
        Arrays.sort(sortedRandomList);

        assertArrayEquals(sortedRandomList, obj.Bsort(randomList));
        System.out.println("Test Case Passed (Large Random List)");

    }

    @Test
    void ssort() {
        System.out.println("S_Sort Case");
        assertArrayEquals(new int[] {1,2,3,4,5,6,8,9,10},obj.Ssort(new int[] {9,10,6,5,4,3,2,1,8}));
        System.out.println("Test Case Passed");

        assertArrayEquals(new int[] {}, obj.Ssort(new int[] {}));
        System.out.println("Test Case Passed (Empty List)");

        assertArrayEquals(new int[] {1,2,3}, obj.Ssort(new int[] {1,2,3}));
        System.out.println("Test Case Passed (Already Sorted List)");

        assertArrayEquals(new int[] {-2, -1, 0, 1, 2}, obj.Ssort(new int[] {2, 1, 0, -1, -2}));
        System.out.println("Test Case Passed (Reverse Sorted)");

        assertArrayEquals(new int[] {1, 1, 2, 3, 3}, obj.Ssort(new int[] {3, 1, 3, 2, 1}));
        System.out.println("Test Case Passed (Duplicates)");
        int[] randomList = generateRandomList(100);
        int[] sortedRandomList = randomList.clone();
        Arrays.sort(sortedRandomList);

        assertArrayEquals(sortedRandomList, obj.Ssort(randomList));
        System.out.println("Test Case Passed (Large Random List)");

    }

    @Test
    void isort()
    {
        System.out.println("I_Sort Case");
        assertArrayEquals(new int[] {1,2,3,4,5,6,8,9,10},obj.Isort(new int[] {9,10,6,5,4,3,2,1,8}));
        System.out.println("Normal Test Case 1 Passed");

        assertArrayEquals(new int[] {1,2,3,4,5,6,7}, obj.Isort(new int[] {3,2,1,5,4,7,6}));
        System.out.println("Normal Test Case 2 Passed");

        assertArrayEquals(new int[] {}, obj.Isort(new int[] {}));
        System.out.println("Test Case Passed (Empty List)");

        assertArrayEquals(new int[] {1,2,3}, obj.Isort(new int[] {1,2,3}));
        System.out.println("Test Case Passed (Already Sorted List)");

        assertArrayEquals(new int[] {-2, -1, 0, 1, 2}, obj.Isort(new int[] {2, 1, 0, -1, -2}));
        System.out.println("Test Case Passed (Reverse Sorted)");

        assertArrayEquals(new int[] {1, 1, 2, 3, 3}, obj.Isort(new int[] {3, 1, 3, 2, 1}));
        System.out.println("Test Case Passed (Duplicates)");

        int[] randomList = generateRandomList(100);
        int[] sortedRandomList = randomList.clone();
        Arrays.sort(sortedRandomList);

        assertArrayEquals(sortedRandomList, obj.Isort(randomList));
        System.out.println("Test Case Passed (Large Random List)");
    }
    public int[] generateRandomList(int size) {
        int[] list = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list[i] = random.nextInt()%size < 0 ? random.nextInt()%size * -1:random.nextInt()%size  ; // Generates a random integer
        }
        return list;
    }

    @Test
    void qsort() {
        System.out.println("Q_Sort Case");
        int[] testArray1={9,10,6,5,4,3,2,1,8};
        obj.Qsort(testArray1,0, testArray1.length-1);
        assertArrayEquals(new int[] {1,2,3,4,5,6,8,9,10},testArray1);
        System.out.println("Normal Test Case 1 Passed");

        int[] testArray2={3,2,1,5,4,7,6};
        obj.Qsort(testArray2,0, testArray2.length-1);
        assertArrayEquals(new int[] {1,2,3,4,5,6,7}, testArray2);
        System.out.println("Normal Test Case 2 Passed");

        int[] testArray3={};
        obj.Qsort(testArray3,0,testArray3.length-1);
        assertArrayEquals(new int[] {}, testArray3);
        System.out.println("Test Case Passed (Empty List)");

        int[] testArray4={1,2,3};
        obj.Qsort(testArray4,0,testArray4.length-1);
        assertArrayEquals(new int[] {1,2,3}, testArray4);
        System.out.println("Test Case Passed (Already Sorted List)");

        int[] testArray5={2, 1, 0, -1, -2};
        obj.Qsort(testArray5,0,testArray5.length-1);
        assertArrayEquals(new int[] {-2, -1, 0, 1, 2}, testArray5);
        System.out.println("Test Case Passed (Reverse Sorted)");

        int[] testArray6={3, 1, 3, 2, 1};
        obj.Qsort(testArray6,0,testArray6.length-1);
        assertArrayEquals(new int[] {1, 1, 2, 3, 3}, testArray6);
        System.out.println("Test Case Passed (Duplicates)");

        int[] randomList = generateRandomList(100);
        int[] sortedRandomList = randomList.clone();
        Arrays.sort(sortedRandomList);
        obj.Qsort(randomList,0, randomList.length-1);
        assertArrayEquals(sortedRandomList, randomList);
        System.out.println("Test Case Passed (Large Random List)");


    }

    @Test
    void msort() {
        System.out.println("M_Sort Case");
        int[] testArray1={9,10,6,5,4,3,2,1,8};
        assertArrayEquals(new int[] {1,2,3,4,5,6,8,9,10},obj.Msort(testArray1));
        System.out.println("Normal Test Case 1 Passed");

        int[] testArray2={3,2,1,5,4,7,6};
        assertArrayEquals(new int[] {1,2,3,4,5,6,7}, obj.Msort(testArray2));
        System.out.println("Normal Test Case 2 Passed");

        int[] testArray3={};
        assertArrayEquals(new int[] {}, obj.Msort(testArray3));
        System.out.println("Test Case Passed (Empty List)");

        int[] testArray4={1,2,3};
        assertArrayEquals(new int[] {1,2,3}, obj.Msort(testArray4));
        System.out.println("Test Case Passed (Already Sorted List)");

        int[] testArray5={2, 1, 0, -1, -2};
        assertArrayEquals(new int[] {-2, -1, 0, 1, 2}, obj.Msort(testArray5));
        System.out.println("Test Case Passed (Reverse Sorted)");

        int[] testArray6={3, 1, 3, 2, 1};
        assertArrayEquals(new int[] {1, 1, 2, 3, 3}, obj.Msort(testArray6));
        System.out.println("Test Case Passed (Duplicates)");

        int[] randomList = generateRandomList(100);
        int[] sortedRandomList = randomList.clone();
        Arrays.sort(sortedRandomList);

        assertArrayEquals(sortedRandomList, obj.Msort(randomList));
        System.out.println("Test Case Passed (Large Random List)");
    }

    @Test
    void csort() {
        System.out.println("C_Sort Case");
        assertArrayEquals(new int[] {1,2,3,4,5,6,8,9,10},obj.Csort(new int[] {9,10,6,5,4,3,2,1,8}));
        System.out.println("Test Case Passed");

        assertArrayEquals(new int[] {}, obj.Csort(new int[] {}));
        System.out.println("Test Case Passed (Empty List)");

        assertArrayEquals(new int[] {1,2,3}, obj.Csort(new int[] {1,2,3}));
        System.out.println("Test Case Passed (Already Sorted List)");

        assertArrayEquals(new int[] {-2, -1, 0, 1, 2}, obj.Csort(new int[] {2, 1, 0, -1, -2}));
        System.out.println("Test Case Passed (Reverse Sorted)");

        assertArrayEquals(new int[] {1, 1, 2, 3, 3}, obj.Csort(new int[] {3, 1, 3, 2, 1}));
        System.out.println("Test Case Passed (Duplicates)");

        int[] randomList = generateRandomList(100);
        int[] sortedRandomList = randomList.clone();
        Arrays.sort(sortedRandomList);

        assertArrayEquals(sortedRandomList, obj.Csort(randomList));
        System.out.println("Test Case Passed (Large Random List)");

    }
}