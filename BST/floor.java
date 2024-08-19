import java.util.*;

class Node{
    int data;
    Node left, right;
    public Node(int data){
        this.data = data;
        left = right = null;
    }
}
public class floor {

    static int floor(Node root, int key){
        int floor = -1;
        while(root!=null){
            if(root.data <= key){
                floor = root.data;
                root = root.right;
            }
            else{
                root = root.left;
            }
        }
        return floor;
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(12);
        root.left.left = new Node(6);
        root.left.right = new Node(9);
        System.out.println(floor(root, 15));
    }
}
