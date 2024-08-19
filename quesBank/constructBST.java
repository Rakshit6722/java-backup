import java.util.*;

class Node{
    public Node(){}
    int data;
    Node left, right;
    public Node(int data){
        this.data =data;
    }
    Node root;

    public void insert(int data){
        root = insertNode(root,data);
    }
    public Node insertNode(Node root, int data){
        if(root == null) return new Node(data);

        if(data>root.data){
            root.right = insertNode(root.right, data);
        }
        else if(data<root.data){
            root.left = insertNode(root.left, data);
        }
        return root;
    }
    
}

class Pair{
    int hd;
    Node node;
    Pair(Node node, int hd){
        this.node = node;
        this.hd = hd;
    }
}




public class constructBST {
    static ArrayList<Integer> level(Node root,int level){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        // if(root == null) return new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer> list = new ArrayList<>();
            
            for(int i=0;i<size;i++){
                Node node = q.poll();

                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);

                list.add(node.data);
            }
            ans.add(list);
        }

        return ans.get(level);
    }
    static ArrayList<Integer> topView(Node root){
        ArrayList<Integer> mia = new ArrayList<>();

        if(root == null) return mia;

        Queue<Pair> q = new LinkedList<>();
        Map<Integer,Integer> map = new TreeMap<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair it = q.remove();
            int hd = it.hd;
            Node temp = it.node;

            if(map.get(hd)==null) map.put(hd, temp.data);
            if(temp.left!=null) q.add(new Pair(temp.left,hd-1));
            if(temp.right!=null) q.add(new Pair(temp.right,hd+1));
        }
        System.out.println(map);
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            mia.add(e.getValue());
        }
        return mia;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = new Node();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            // int depth = sc.nextInt(); 
            root.insert(val);
        }

        // ArrayList<Integer> mia = topView(root.root);
        // for(int i=0;i<mia.size();i++){
        //     System.out.println(mia.get(i));
        // }
        ArrayList<Integer> ans = level(root.root, 1);
        System.out.println(ans);
    }

    }

