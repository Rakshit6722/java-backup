import java.util.*;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int val){
        this.data = val;
        left = right = null;
    }
}
public class preOrderTraversals {

    public static void preOrder(Node curr, ArrayList<Integer> arr){
        if(curr == null) return;

        arr.add(curr.data);
        preOrder(curr.left, arr);
        preOrder(curr.right, arr);

    }
    public static List<Integer> answer(Node root){
        ArrayList<Integer> ans = new ArrayList<>();

        preOrder(root, ans);

        return ans;


    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // ArrayList<Integer> ans = new ArrayList<>();
        System.out.println(answer(root));
    }
}
