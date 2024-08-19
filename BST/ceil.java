import java.util.*;

class Node{
    int data;
    Node left, right;
    public Node(int data){
        this.data = data;
        left=right=null;
    }
}

public class ceil {

    static int findCeil(Node root, int key){
        int ceil = -1;
        while(root!=null){
            if(root.data>=key){
                ceil = root.data;
                root = root.left;
            }
            else{
                root = root.right;
            }
            
        }
        return ceil;
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(12);
        root.left.left = new Node(6);
        root.left.right = new Node(9);
        System.out.println(findCeil(root, 2));
    }
}
