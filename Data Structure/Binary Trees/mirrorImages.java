import java.io.*;
import java.util.*;

class mirrorImages {
    public static class treeNode {
        public int data;
        public treeNode left = null;
        public treeNode right = null;
        public treeNode(int d) {
            this.data = d;
        }
        public treeNode() {
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String[] inputN = br.readLine().trim().split(" ");
        // int N = Integer.parseInt(inputN[0]);
        // int Q = Integer.parseInt(inputN[1]);
        int N = Integer.parseInt(br.readLine().trim());
        treeNode root = new treeNode(1);
        for(int i = 1; i < N; i++) {
            String[] input = br.readLine().trim().split(" ");
            int parent = Integer.parseInt(input[0]);
            int child = Integer.parseInt(input[1]);
            root = insertTree(root, parent, child, input[2]);
        }
        print_tree(root);
    }
    public static treeNode insertTree(treeNode root, int parent, int data, String side) {
        treeNode parent_node = inorder(root, parent);
        if(side.equals("L"))
            parent_node.left = new treeNode(data);
        else 
            parent_node.right = new treeNode(data);
        // System.out.println(parent_node.left.data + " L -> " + parent_node.data + " -> R " + parent_node.right.data);
        return root;
    }
    public static treeNode inorder(treeNode root, int data) {
        if(root == null)
            return null;
        if(data == root.data)
            return root;
        treeNode found = new treeNode();
        found = inorder(root.left, data);
        if(found != null) 
            return found;
        found = inorder(root.right, data);
        if (found != null)
            return found;
        return null;
    }
    public static void print_tree(treeNode root) {
        if(root == null)
            return;
        print_tree(root.left);
        System.out.print(root.data + " ");
        print_tree(root.right);
    }
}