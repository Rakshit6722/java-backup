import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;
    public Node(int val){
        this.data = val;
        left = right = null;
    }
}
public class levelOrder {

    public static ArrayList<ArrayList<Integer>> levelOrderAns(Node root){
        Queue<Node> temp = new LinkedList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        if(root == null) return ans;

        //adding the first root element to queue
        temp.offer(root);

        while(!temp.isEmpty()){
            //creating a sublist to add queue elements
            ArrayList<Integer> subList = new ArrayList<>();
            int tempSize = temp.size();
            for(int i=0;i<tempSize;i++){
                if(temp.peek().left!=null){
                    temp.offer(temp.peek().left);
                }
                if(temp.peek().right!=null){
                    temp.offer(temp.peek().right);
                }
                subList.add(temp.poll().data);
            }
            ans.add(subList);
        }
        return ans;


    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(levelOrderAns(root));
    }
}
