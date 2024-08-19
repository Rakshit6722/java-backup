import java.util.*;

class Node{
    int data;
    Node left, right;
    public Node(int data){
        this.data = data;
        left = right = null;
    }
}

public class lca {

    static Node lowestCommonAncestor(Node root, Node a, Node b){
        if(root == null || root == a || root == b){
            return root;
        }
        Node left = lowestCommonAncestor(root.left, a, b);
        Node right = lowestCommonAncestor(root.right, a, b);

        if(left==null){
            return right;
        }
        else if(right == null){
            return left;
        }
        else{
            return root;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        // System.out.println(lowestCommonAncestor(root, 5, 4));
    }
}
