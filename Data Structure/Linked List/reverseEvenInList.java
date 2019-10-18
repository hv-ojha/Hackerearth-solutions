import java.io.*;
import java.util.*;

public class Node {
    int data;
    Node next;
    public Node() {
        this.next = null;
    }
    public Node(int dt) {
        this.data = dt;
        this.next = null;
    }
}

public class reverseEvenInList {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        String[] stringInput = br.readLine().trim().split(" ");
        Node root = new Node();
        for(int i = 0; i < N; i++) {
            root = insertNode(root, Integer.parseInt(stringInput[i]));
        }
        Node temp = root;
        while(temp != null) {
            System.out.println(temp.data + " -> ");
        }
    }
    public static Node insertNode(Node root, int data) {
        if(root == null) {
            Node temp = new Node(data);
            temp.next = null;
            return temp;
        }
        else {
            Node temp = root;
            Node newNode = new Node(data);
            while(temp.next != null) 
                temp = temp.next;
            temp.next = newNode;
            return temp;
        }
    }
    
}