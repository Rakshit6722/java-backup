class Node{
    int data;
    Node left;
    Node right;

    public Node(int val){
        this.data = val;
        left = right = null;
    }
}
public class diameter {

    static int ans(Node root){
        int[] diameter = new int[1];
        height(root,diameter);
        return diameter[0];
    }
    static int height(Node root, int[] diameter){
        if(root==null) return 0;

        int lh = height(root.left, diameter);
        int rh = height(root.right, diameter);

        diameter[0] =  Math.max(diameter[0],lh+rh);
        return 1+Math.max(lh,rh);

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

        System.out.println(ans(root));
    }
}
