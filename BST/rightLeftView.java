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
public class rightLeftView {
    static ArrayList<Integer> answer(Node root){
        ArrayList<Integer> ans = new ArrayList();
        rightView(root,ans,0);
        return ans;
    }
    static void rightView(Node root, ArrayList<Integer> arr, int level){
        if(root==null){
            return;
        }
        if(level==arr.size()){
            arr.add(root.data);
        }
        rightView(root.right, arr, level+1);
        rightView(root.left, arr, level+1);

    }
    static void leftView(Node root, ArrayList<Integer> arr, int level){
        if(root==null){
            return;
        }
        if(level==arr.size()){
            arr.add(root.data);
        }
        rightView(root.left, arr, level+1);
        rightView(root.right, arr, level+1);

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println(answer(root));
    }
}
