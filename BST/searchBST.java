import java.util.*;

class Node{
    int data;
    Node left, right;
    public Node(int data){
        this.data = data;
        left = right = null;
    }
}
public class searchBST {

    static Node binarySearch(Node root, int val){
        while(root!=null){
            if(root.data==val) return root;
            else if(val<root.data){
                root = root.left;
            }
            else{
                root = root.right;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(12);
        root.left.left = new Node(6);
        root.left.right = new Node(9);
        
        Node ans = binarySearch(root, 12);
        System.out.println(ans.data);
    }
}
