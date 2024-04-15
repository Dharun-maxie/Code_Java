package Tree.AVL;

public class AVLMain {
    public static void main(String[] args) {
        AVL obj=new AVL();

        int[] Array=new int[10];
        for (int i = 0; i < Array.length; i++) {
            Array[i]=i+1;
        }
        obj.Populate(Array);
        obj.Display();

        System.out.println(obj.height());
        System.out.println(obj.Balanced());
    }
}
