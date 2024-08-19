class Node{
    int data;
    Node left;
    Node right;

    public Node(int val){
        this.data = val;
        left = right = null;
    }
}
public class checkBalanced {
    static int check(Node root){
        if(root == null) return 0;

        int lh = check(root.left);
        if(lh==-1) return -1;
        int rh = check(root.right);
        if(rh==-1) return -1;

        if(Math.abs(lh-rh)>1) return -1;

        return 1 + Math.max(lh,rh);
    
    }
    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(4);
        root.left.left = new Node(3);
        root.left.left.left = new Node(9);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.right.right = new Node(7);
        root.right.right.right.right = new Node(8);

        System.out.println(check(root));
    }
}
