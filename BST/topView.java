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
class Pair{
    Node node;
    int hd;
    public Pair(Node node, int hd){
        this.node = node;
        this.hd = hd;
    }
}
public class topView {

    static ArrayList<Integer> topViewTraversal(Node root){
        ArrayList<Integer> ans = new ArrayList();
        if(root == null) return ans;
        Map<Integer,Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair it = q.remove();
            int hd = it.hd;
            Node temp = it.node;
            if(map.get(hd)==null) map.put(hd,temp.data);
            if(temp.left!=null) q.add(new Pair(temp.left,hd-1));
            if(temp.right!=null) q.add(new Pair(temp.right,hd+1));
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println(topViewTraversal(root));
    }
}
