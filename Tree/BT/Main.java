package Tree.BT;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTree obj = new BinaryTree();

        Scanner scanner = new Scanner(System.in);

        obj.populate(scanner);

        obj.prettyDisplay();

    }
}
