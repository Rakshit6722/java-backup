class Node{
    int data;
    Node left, right;
    public Node(int data){
        this.data = data;
        left = right = null;
    }
}

public class insertGivenNodeBST {

    public Node insert(Node root, int val){
        if(root == null) return new Node(val);
        Node temp = root;
        while(true){

            //if val is greater than root, then we will insert it at the right side
            if(temp.data <= val){
                //keep traversing at right side till we find null
                if(temp.right!=null) temp = temp.right; 
                else{
                    temp.right = new Node(val);
                    break;
                }
            }
            else{
                if(temp.left!=null) temp = temp.left;
                else{
                    temp.right = new Node(val);
                    break;
                }
            }
        }
        return root;
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(12);
        root.left.left = new Node(6);
        root.left.right = new Node(9);
    }
}
