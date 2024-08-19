import java.util.*;

class Node{
    int data;
    Node left, right;
    public Node(int data){
        this.data = data;
        left = right = null;
    }
}

public class rootToNodePath {
    static boolean findPath(Node root, ArrayList<Integer> arr, int x){
        if(root==null) return false;

        arr.add(root.data);
        if(root.data == x){
            return true;
        }
        if(findPath(root.left, arr, x) || findPath(root.right, arr, x)){
            return true;
        }
        arr.remove(arr.size()-1);
        return false;

    }
    static ArrayList<Integer> answer(Node root, int x){
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null) return res;
        findPath(root, res, x);
        return res;
        
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println(answer(root, 5));
    }
}
