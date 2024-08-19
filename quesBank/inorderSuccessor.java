import java.util.*;

class inorderSuccessor {
    class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    Node root;

    inorderSuccessor() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.data)
            root.left = insertRec(root.left, key);
        else if (key > root.data)
            root.right = insertRec(root.right, key);
        return root;
    }

    Node inorderSuccessor(Node root, Node x) {
        // Enter your Code here
        Node successor = null;

        while(root!=null){
            if(root.data<=x.data){
                root = root.right;
            }
            else{
                successor = root;
                root = root.left;

            }
        }
        return successor;
    }

    public static void main(String args[]) {
        inorderSuccessor tree = new inorderSuccessor();
        Scanner scanner = new Scanner(System.in);
        int numNodes = scanner.nextInt();
        for (int i = 0; i < numNodes; i++) {
            int value = scanner.nextInt();
            tree.insert(value);
        }
        int referenceValue = scanner.nextInt();
        Node x = tree.findNode(tree.root, referenceValue);
        Node result = tree.inorderSuccessor(tree.root, x);
        if (result != null)
            System.out.println(result.data);
        else
            System.out.println("No inorder successor found");
        scanner.close();
    }

    Node findNode(Node root, int value) {
        if (root == null || root.data == value)
            return root;
        if (value < root.data)
            return findNode(root.left, value);
        else
            return findNode(root.right, value);
    }
}
