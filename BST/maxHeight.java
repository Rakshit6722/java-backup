class Node{
    int data;
    Node left;
    Node right;
    public Node(int val){
        this.data = val;
        left = right = null;
    }
}
public class maxHeight {

    static int maxDepth(Node root){
        if(root==null) return 0;

        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);

        return 1 + Math.max(lh,rh);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(maxDepth(root));
    }
}
