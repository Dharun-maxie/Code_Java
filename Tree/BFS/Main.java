package Tree.BFS;

import Tree.BST.BSTree;
import Tree.BST.Node;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        BSTree obj = new BSTree();

        obj.Populate(new int[]{10,5,3,1,4,7,6,9,16,13,11,15,18,17,19});
        obj.Display();

        List<List<Integer>> ans=BFSPrint(obj.root);
        System.out.println(ans);

//        List<Float> levelledAvg = LevelAvg(obj.root);
//        System.out.println(levelledAvg);

//        int NextPredecessor = SuccessfulPredecessor(obj.root, 2);
//        System.out.println(NextPredecessor);

//        List<List<Integer>> list = ZigZagBFSPrint(obj.root);
//        System.out.println(list);

//        System.out.println(isSibling(obj.root, obj.root.left.right.left,obj.root.left.right.right));

//        System.out.println(isCousin(obj.root, obj.root.left.right.left,obj.root.right.left.right));

//        System.out.println(DiameterOfTree(obj.root,0));
//
//        System.out.println();

        System.out.println(isPathExist(obj.root,new int[] {10,16,13,12}));
    }

    public static List<List<Integer>> BFSPrint(Node node) {
        List<List<Integer>> list = new ArrayList<>();

        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        while (!queue.isEmpty()) {
            List<Integer> CurrentList = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node CurrenNode = queue.poll();
                if (CurrenNode != null) {
                    CurrentList.add(CurrenNode.data);
                    if (node.left != null) {
                        queue.add(CurrenNode.left);
                    }
                    if (node.right != null) {
                        queue.add(CurrenNode.right);
                    }
                }
            }
            if (!CurrentList.isEmpty())
                list.add(CurrentList);
        }
        return list;
    }

    public static List<Float> LevelAvg(Node node) {
        List<Float> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);

        while (!queue.isEmpty()) {
            float avg = 0;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node currentNode = queue.poll();
                if (currentNode != null) {
                    avg += currentNode.data;
                    if (currentNode.left != null) {
                        queue.offer(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        queue.offer(currentNode.right);
                    }
                }
            }
            list.add(avg / size);
        }
        return list;
    }

    public static int SuccessfulPredecessor(Node node, int key) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);

        while (!queue.isEmpty()) {
            Node CurrentNode = queue.poll();
            if (CurrentNode != null) {
                if (CurrentNode.left != null)
                    queue.offer(CurrentNode.left);
                if (CurrentNode.right != null)
                    queue.offer(CurrentNode.right);
                if (CurrentNode.data == key) {
                    try {
                        return queue.remove().data;
                    } catch (Exception e) {
                        return -1;
                    }
                }
            }
        }
        return -1;
    }
    public static List<List<Integer>> ZigZagBFSPrint(Node node)
    {
        List<List<Integer>> list =new ArrayList<>();
        Deque<Node> queue = new ArrayDeque<>();
        queue.add(node);
        int RotateCounter=0;
        while(!queue.isEmpty())
        {
            List<Integer> CurrentList = new ArrayList<>();
            int ListSize= queue.size();
            if(RotateCounter % 2 == 0) {
                // Normal order
                for (int i = 0; i < ListSize; i++) {
                    Node CurrentNode=queue.pollFirst();
                    if(CurrentNode != null)
                    {
                        CurrentList.add(CurrentNode.data);
                        if(CurrentNode.left != null)
                            queue.offerLast(CurrentNode.left);
                        if(CurrentNode.right != null)
                            queue.offerLast(CurrentNode.right);
                    }
                }
            }
            else
            {
                for (int i = 0; i < ListSize; i++) {
                    // Reverse order
                    Node CurrentNode = queue.pollLast();
                    if (CurrentNode != null) {
                        CurrentList.add(CurrentNode.data);
                        if (CurrentNode.right != null)
                            queue.offerFirst(CurrentNode.right);
                        if (CurrentNode.left != null)
                            queue.offerFirst(CurrentNode.left);
                    }
                }
            }
            list.add(CurrentList);
            RotateCounter++;
        }
        return list;
    }

    public static boolean isSibling(Node root,Node node1,Node node2)
    {
        if(root == null)
            return false;
        return (
                root.left == node1 && root.right == node2 || root.left == node2 && root.right == node1
                        || isSibling(root.left, node1, node2) || isSibling(root.right, node1, node2)
        );
    }

    public static boolean isCousin(Node root,Node node1,Node node2)
    {
        return (
                level(root,node1,0) == level(root,node1,0) && !isSibling(root,node1,node2)
                );
    }

    private static int level(Node root, Node node, int i) {
        if (root == null)
            return 0;
        if (root == node)
            return i;
        return Math.max(level(root.left,node,i+1),level(root.right,node,i+1));
    }
    private static int DiameterOfTree(Node root, int i) {
        if (root == null)
            return i;

        int left=DiameterOfTree(root.left,i+1);
        int right=DiameterOfTree(root.right,i+1);

        return Math.max(left,right);
    }
    public static boolean isPathExist(Node node, int[] path)
    {
        return isPath(node,path,0);
    }

    private static boolean isPath(Node node, int[] path, int level) {
        if (node == null)
            return false;
        if(level >= path.length || node.data != path[level])
            return false;
        if(level == path.length-1 && node.left == null && node.right == null)
            return true;
        return isPath(node.left,path,level+1) || isPath(node.right,path,level+1);
    }
}