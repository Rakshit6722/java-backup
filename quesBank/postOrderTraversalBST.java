import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

class postOrderTraversalBST {
    Node root;

    postOrderTraversalBST() {
        root = null;
    }

    void insert(int value) {
        // Enter Code herpostOrderTraversal
        root = insertRec(root,value);
    }
    Node insertRec(Node node, int value){
        if(node==null) return new Node(value);

        if(value>node.data){
            node.right = insertRec(node.right, value);
        }
        else if(value<node.data){
            node.left = insertRec(node.left, value);
        }
        return node;
    }
    void postorderTraversal(Node node) {
        // Enter Code here
        if(node!=null){
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.data+" ");
        }

    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        postOrderTraversalBST tree = new postOrderTraversalBST();
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            tree.insert(value);
        }
        tree.postorderTraversal(tree.root);
        scanner.close();
    }
}

