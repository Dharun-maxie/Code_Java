package Tree.DFS;

import java.util.Scanner;

// import Tree.BST.BSTree;
import Tree.BT.BinaryTree;
import Tree.BT.BinaryTree.Node;

public class DFS {
    public static void main(String[] args) {
        // BSTree obj = new BSTree();
        // insane Tree
        // obj.Populate(new int[] {17,15,8,2,-1,4,5,6,7,9,10,11,12,21,20,23,22,25,27});

        // Perfect Binary Tree
        // obj.Populate(new int[] { 10, 5, 3, 1, 4, 7, 6, 9, 16, 13, 11, 15, 18, 17, 19
        // });

        // obj.Populate(new int[] { 5, 2, 3, 1, 4, 9, 6, 10 });

        BinaryTree obj1 = new BinaryTree();

        Scanner scanner = new Scanner(System.in);
        obj1.populate(scanner);

        obj1.prettyDisplay();

        // System.out.println(Diameter(obj.root));
        //
        // System.out.println(Height(obj.root));
        // Inverting Tree
        // InvertAnTree(obj.root);
        // obj.Display();
        // SkewedTree(obj.root);
        // obj.Display();

        // System.out.println(isValidBST(obj.root));

        // Node node = lowestCommonAncestor(obj.root, obj.root.right.left,
        // obj.root.right.left.left);

        // System.out.println(node.data);
        // System.out.println(hasPathSum(obj.root, 200));

        // System.out.println(sumNumbers(obj.root));

        // System.out.println(MaxPathSum(obj1.root));

        System.out.println(isPathExist(obj1.root, new int[] {3,4,7,5}));
    }

    public static int Diameter(Node node) {
        return DiameterOfTree(node);
    }

    public static int Height(Node node) {
        return DiameterOfTree(node) - 1;
    }

    public static int Dia = 0;

    private static int DiameterOfTree(Node node) {
        if (node == null)
            return 0;
        int left = DiameterOfTree(node.left);
        int right = DiameterOfTree(node.right);

        Dia = Math.max((left + right + 1), Dia);

        return left + right + 1;
    }

    // private static int[] DiameterOfTree(Node node) {
    // if (node == null)
    // return new int[] {0,0};//{Height , Diameter}
    //
    // int[] left=DiameterOfTree(node.left);
    // int[] right=DiameterOfTree(node.right);
    // int height=Math.max(left[0],right[0])+1;
    // int diameter=Math.max(left[0]+right[0],Math.max(left[1],right[1]));
    //
    // return new int[]{height,diameter};
    // }

    // public static int GetHeight(Node node)
    // {
    // return GetHeight(node,0);
    // }
    // private static int GetHeight(Node node,int i)
    // {
    // if (node == null) {
    // return 0;
    // }
    // return Math.max(GetHeight(node.left,i+1), GetHeight(node.right,i+1))+1;
    // }

    public static void InvertAnTree(Node node) {
        if (node == null)
            return;
        InvertAnTree(node.left);
        InvertAnTree(node.right);

        Swap(node);
    }

    private static void Swap(Node node) {
        if (node != null && node.left != null && node.right != null) {
            Node temp = node.left;
            node.left = node.right;
            node.right = temp;
        }
    }

    public static void SkewedTree(Node node) {
        Node currentNode = node;
        while (currentNode != null) {
            if (currentNode.left != null) {
                Node RightMostNode = currentNode.left;
                while (RightMostNode.right != null) {
                    RightMostNode = RightMostNode.right;
                }
                RightMostNode.right = currentNode.right;
                currentNode.right = currentNode.left;
                currentNode.left = null;
            }
            currentNode = currentNode.right;
        }
    }

    // public static boolean isValidBST(Node node) {
    // return isValidBST(node, null, null);
    // }

    // private static boolean isValidBST(Node node, Integer low, Integer high) {
    // if (node == null)
    // return true;

    // if (node != null) {
    // if (high != null && node.data > high) {
    // return false;
    // }
    // if (low != null && node.data < low) {
    // return false;
    // }
    // }

    // boolean left = isValidBST(node.left, low, node.data);
    // boolean right = isValidBST(node.right, node.data, high);
    // return left == right;
    // }

    public static Node lowestCommonAncestor(Node node, Node p, Node q) {
        if (node == null)
            return null;
        if (node == p || node == q)
            return node;
        Node left = lowestCommonAncestor(node.left, p, q);
        Node right = lowestCommonAncestor(node.right, p, q);

        if (left != null && right != null) {
            return node;
        }
        if (left == null && right != null)
            return right;
        return left;
    }

    // public static boolean hasPathSum(Node node, int target) {
    // if (node == null)
    // return false;

    // if (node.data == target)
    // return true;

    // boolean left = hasPathSum(node.left, target - node.data);
    // boolean right = hasPathSum(node.right, target - node.data);

    // return left || right;
    // }

    // public static int sumNumbers(Node root) {
    // return sumNumbers(root, 0);
    // }

    // private static int sumNumbers(Node node, int counter) {
    // if (node == null)
    // return 0;
    // counter = counter * 10 + node.data;
    // if (node.left == null && node.right == null) {
    // return counter;
    // }
    // return sumNumbers(node.left, counter) + sumNumbers(node.right, counter);

    // }

    public static int max = 0;

    // public static int MaxPathSum(Node node) {
    // if (node == null)
    // return 0;

    // int left = sumNumber(node.left, 0);
    // int right = sumNumber(node.right, 0);
    // int max = Math.max(node.value + left, node.value + right);
    // max = Math.max(max, node.value + left + right);
    // System.out.println("Node -> " + node.value + ">>> Left Sum -> " + left + ">>>
    // Right Sum ->" + right
    // + ">>> Max Sum -> " + max);
    // return (Math.max(max, Math.max(MaxPathSum(node.left),
    // MaxPathSum(node.right))));
    // }

    // private static int sumNumber(Node node, int counter) {
    // if (node == null)
    // return 0;
    // counter = counter + Math.max(0, node.value);
    // if (node.left == null && node.right == null) {
    // return counter;
    // }
    // return Math.max(sumNumber(node.left, counter), sumNumber(node.right,
    // counter));
    // }
    private static int MaxPathSum(Node node) {
        if (node == null)
            return 0;
        if (node.left == null && node.right == null)
            return max += node.value;

        int left = MaxPathSum(node.left);
        int right = MaxPathSum(node.right);

        max = Math.max((left + right + 1), max);

        System.out.println(STR."Node ->  \{node.value}>>> Left Sum -> \{left}>>> Right Sum ->\{right}>>> Max Sum -> \{max}");

        return left + right + 1;
    }
    public static boolean isPathExist(Node node,int[] path)
    {
        return isPathExist(node,path,0);
    }

    private static boolean isPathExist(Node node, int[] path, int level) {
        if (node == null)
            return false;
        if(node.value != path[level])
            return false;
        return isPathExist(node.left,path,level+1) || isPathExist(node.right,path,level+1);
    }

}
