package Tree.SegmentTree;

public class Main {
    public static void main(String[] args) {

        SegTree obj = new SegTree();

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        obj.Insert(arr);

        obj.Display();
        System.out.println();
        System.out.println(obj.Query(0, 4));
        System.out.println();
        obj.Update(10, 9);
        obj.Display();
    }
}
