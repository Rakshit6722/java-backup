class Node{
    int data;
    Node left, right;
    public Node(int data){
        this.data = data;
        left = right = null;
    }
}

public class deleteNodeBST {

    static Node deleteNode(Node root, int key){
        if(root == null) return null;
        if(root.data == key) return helper(root);
        Node temp = root;
        while(root!=null){
            if(root.data>key){
                if(root.left!=null && root.left.data==key){
                    root.left = helper(root.left);
                }
                else{
                    root = root.left;
                }
            }
            else{
                if(root.right!=null && root.right.data==key){
                    root.right = helper(root.right);
                }
                else{
                    root = root.right;
                }
            }
        }
        return temp;
    }
    
    static Node helper(Node root){
        if(root.left==null){
            return root.right;
        }
        else if(root.right==null){
            return root.left;
        }
        Node rightChild = root.right;
        Node lastRight = findLast(root.left);
        lastRight.right = rightChild;
        return root.left;
    }

    static Node findLast(Node root){
        if(root.right==null){
            return root;
        }
        return findLast(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(12);
        root.left.left = new Node(6);
        root.left.right = new Node(9);

        Node delete = deleteNode(root, 12);
        System.out.println(delete.data);
    }
}
