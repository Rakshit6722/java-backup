class Node{
    int data;
    Node left;
    Node right;
    public Node(int val){
        this.data = val;
        left = right = null;
    }
}

public class implementation{
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(4);
        root.left.right = new Node(6);

        System.out.println(root.left.right.data);
    }
}