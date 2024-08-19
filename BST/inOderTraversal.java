import java.util.ArrayList;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int val){
        this.data = val;
        left = right = null;
    }
}

public class inOderTraversal {

    static void inorder(Node root, ArrayList<Integer> arr){
        if(root == null) return;

        inorder(root.left, arr);
        arr.add(root.data);
        inorder(root.right, arr);
    }
    static ArrayList<Integer> answer(Node root){
        ArrayList ans = new ArrayList<>();

        inorder(root,ans);

        return ans;
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
