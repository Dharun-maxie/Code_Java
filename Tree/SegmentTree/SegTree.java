package Tree.SegmentTree;

import java.util.Collections;

class Node
{
    int data,SInterval,EInterval;
    Node left,right;

    public Node(int S,int E)
    {
        this.SInterval=S;
        this.EInterval=E;
    }
}
public class SegTree {

    // ROOT
    private Node root;

    // INSERT
    public void Insert(int[] Array) {root=insert(Array,0, Array.length-1);}
    private Node insert(int[] array,int S,int E) {
        if (S == E) {
            Node node = new Node(S, E);
            node.data = array[S];
            return node;
        }
        Node node = new Node(S, E);

        int M = (S + E) / 2;
        node.left = insert(array, S, M);
        node.right = insert(array, M + 1, E);

        node.data = node.left.data + node.right.data;

        return node;
    }
   // QUERY
    public int Query(int S,int E) {return query(root,S,E);}

    private int query(Node node, int S, int E) {

        if(node.SInterval >= S && node.EInterval <= E)
            return node.data;
        if(node.SInterval > E || node.EInterval < S)
            return 0;
        else
            return query(node.left, S, E)+query(node.right, S, E);
    }
    // DISPLAY
    public void Display(){display(root,0);}
    private void display(Node node, int level) {
        if (node == null)
            return;
        display(node.left,level+1);

        System.out.println(String.join(" ", Collections.nCopies(level*3," "))+node.data);

        display(node.right,level+1);
    }

    // UPDATE
    public void Update(int data,int index)
    {
        root.data = update(root,data,index);
    }
    private int update(Node node, int data, int index) {
        if (node.SInterval <= index && node.EInterval >= index) {
            if(index == node.SInterval && index == node.EInterval)
                node.data=data;
            else
                node.data = update(node.left, data, index)+update(node.right, data, index);
            return node.data;
        }
        return node.data;
    }

}
