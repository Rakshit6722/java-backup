class Node{
    int data;
    Node left;
    Node right;

    public Node(int val){
        this.data = val;
        left = right = null;
    }
}
public class maxSumPath {
    
    static int ans(Node root){
        int max[] = new int[1];
        max[0] = Integer.MIN_VALUE;
        height(root,max);
        return max[0];
    }
    static int height(Node root, int[] maxi){
        if(root == null) return 0;
        int lh = height(root.left, maxi);
        int rh = height(root.right, maxi);
        maxi[0] = Math.max(maxi[0],lh+rh+root.data);
        return Math.max(lh,rh)+root.data;
    }
    public static void main(String[] args) {
        
        Node root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
        System.out.println(ans(root));
    }
}
