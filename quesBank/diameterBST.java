import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

class diameterBST {
    Node root;

    diameterBST() {
        root = null;
    }

    void insert(int value) {
        root = insertRec(root, value);
    }

    Node insertRec(Node root, int value) {
        if (root == null)
            return new Node(value);
        if (value < root.data)
            root.left = insertRec(root.left, value);
        else if (value > root.data)
            root.right = insertRec(root.right, value);
        return root;
    }

    int height(Node node) {
        // Enter code here
        if(node == null) return 0;

        int lh = height(node.left);
        int rh = height(node.right);

        return 1 + Math.max(lh,rh);
    }
    int height1(Node node, int[] arr) {
        // Enter code here
        if(node == null) return 0;

        int lh = height(node.left);
        int rh = height(node.right);
        arr[0] = Math.max(arr[0],1+lh+rh);
        return 1 + Math.max(lh,rh);
    }

    int diameter(Node root) {
        // Enter code here
        int[] diameter = new int[1];
        height1(root, diameter);
        return diameter[0];
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        diameterBST tree = new diameterBST();
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            tree.insert(value);
        }
        System.out.println(tree.diameter(tree.root));
        scanner.close();
    }
}
