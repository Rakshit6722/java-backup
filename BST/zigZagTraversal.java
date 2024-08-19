import java.util.*;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int val){
        this.data = val;
        left = right = null;
    }
}
public class zigZagTraversal {
    static ArrayList<ArrayList<Integer>> traversal(Node root){
        Queue<Node> temp = new LinkedList();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        if(root==null) return ans;
        temp.offer(root);
        boolean flag = true;
        while(!temp.isEmpty()){
            int tempSize = temp.size();
            ArrayList<Integer> subList = new ArrayList<>();
            for(int i=0;i<tempSize;i++){
                int index = i;
                if(temp.peek().left!=null) temp.offer(temp.peek().left);
                if(temp.peek().right!=null) temp.offer(temp.peek().right);
                if(flag) subList.add(index,temp.poll().data);
                else subList.add(0,temp.poll().data);
            }
            flag = !flag;
            ans.add(subList);
        }
        return ans;


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

        System.out.println(traversal(root));
    }
}
