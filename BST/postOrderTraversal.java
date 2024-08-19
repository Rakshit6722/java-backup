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
public class postOrderTraversal {

    static ArrayList<Integer> answer(Node root){
        ArrayList<Integer> ans = new ArrayList<>();

        postOrder(root,ans);

        return ans;
    }

    static void postOrder(Node root, ArrayList<Integer> ans){
        if(root == null) return;

        postOrder(root.left, ans);
        postOrder(root.right, ans);
        ans.add(root.data);
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
