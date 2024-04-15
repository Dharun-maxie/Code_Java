package Tree.BST;

import java.util.Collections;

public class BSTree {
    public Node root;

    public void Populate(int[] arr)
    {
        for (int i:arr)
            Insert(i);
    }

    private void Insert(int i) {
        root = Insert(root,i);
    }
    private Node Insert(Node node, int i) {
        if(node == null)
        {
            node=new Node(i);
            return node;
        }
        if(node.data > i )
            node.left=Insert(node.left,i);
        if(node.data < i)
            node.right=Insert(node.right,i);

        return node;
    }
    public void Display() {
        Display(root,0);
    }
    public void Display(Node node,int level) {
        if (node == null)
            return;
        Display(node.right,level+1);
        System.out.println(String.join(" ", Collections.nCopies(level * 3, " "))+ node.data);
        Display(node.left,level+1);
    }

}
