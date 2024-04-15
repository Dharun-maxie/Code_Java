package Tree.AVL;

import java.util.Collections;

public class AVL {
    static class Node {
        int data;
        Node left;
        Node right;
        int height;

        public Node(int data) {
            this.data = data;
            height = 1;
        }
    }

    public Node root;

    private void Insert(int data) {
        root = insert(root, data);
    }

    private Node insert(Node node, int data) {
        if (node == null) {
            node = new Node(data);
            return node;
        }
        if (node.data < data)
            node.right = insert(node.right, data);

        if (node.data > data)
            node.left = insert(node.left, data);

        node.height = 1 + Math.max(Height(node.left), Height(node.right));

        return Rotate(node);
    }

    private Node Rotate(Node node) {
        // left heavy
        if (Height(node.left) - Height(node.right) > 1) {
            // left - left case
            // in this case the child node left tree's height higher than it's right tree's
            // height.
            if (Height(node.left.left) - Height(node.left.right) > 0)
                return RightRotate(node);
            // left - right case
            if (Height(node.left.left) - Height(node.left.right) < 0) {
                node.left = LeftRotate(node.left);
                return RightRotate(node);
            }
        }
        // right heavy
        if (Height(node.left) - Height(node.right) < -1) {
            // right - right case
            if (Height(node.right.left) - Height(node.right.right) < 0)
                return LeftRotate(node);
            // right - left case
            if (Height(node.right.left) - Height(node.right.right) > 0) {
                node.right = RightRotate(node.right);
                return LeftRotate(node);
            }
        }
        return node;
    }

    private Node RightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(Height(p.left), Height(p.right) + 1);
        c.height = Math.max(Height(c.left), Height(c.right) + 1);

        return c;
    }

    private Node LeftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        p.height = Math.max(Height(p.left), Height(p.right) + 1);
        c.height = Math.max(Height(c.left), Height(c.right) + 1);

        return p;
    }

    public void Populate(int[] x) {
        for (int j : x) {
            Insert(j);
        }
    }

    public void Display() {
        display(root, 0);
    }

    private void display(Node node, int level) {
        if (node == null)
            return;
        display(node.right, level + 1);
        System.out.println(String.join(" ", Collections.nCopies(level * 3, " ")) + node.data);
        display(node.left, level + 1);
    }

    public int height() {
        return Height(root);
    }

    private int Height(Node node) {
        if (node == null)
            return -1;
        return node.height;
    }

    public Boolean Balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null)
            return true;

        return Math.abs(Height(node.left) - Height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }
}
