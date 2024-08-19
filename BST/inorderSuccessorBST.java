class Node{
    int data;
    Node left, right;
    public Node(int data){
        this.data = data;
        left = right = null;
    }
}

public class inorderSuccessorBST {
    static Node findSuccessor(Node root, Node p){
        Node successor = null;
        while(root!=null){
            if(root.data<=p.data){
                root = root.right;
            }
            else{
                successor = root;
                root = root.left;
            }
        }
        return successor;
    }
    public static void main(String[] args) { 
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(12);
        root.left.left = new Node(6);
        root.left.right = new Node(9);
    }
}
