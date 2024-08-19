import java.util.*;

class Node {
    int data;
    int depth;
    Node left, right;

    Node(int value, int d) {
        data = value;
        depth = d;
        left = right = null;
    }
}

class topViewBST {
    Node root;

    topViewBST() {
        root = null;
    }

    void insert(int value, int depth) {
        root = insertRec(root, value, depth);
    }

    Node insertRec(Node root, int value, int depth) {
        if (root == null)
            return new Node(value, depth);
        if (value < root.data)
            root.left = insertRec(root.left, value, depth + 1);
        else if (value > root.data)
            root.right = insertRec(root.right, value, depth + 1);
        return root;
    }
    class Pair{
        int hd;
        Node node;
        Pair(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }

    }

    void topView() {
        // Enter your code here
        Map<Integer,Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        while(!q.isEmpty()){
            Pair it = q.remove();
            int hd = it.hd;
            Node temp = it.node;

            if(map.get(hd)==null) map.put(temp.data, hd);
            if(temp.left!=null) q.add(new Pair(temp.left, hd-1));
            if(temp.right!=null) q.add(new Pair(temp.right, hd+1));

        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            arr.add(e.getValue());
        }

    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        topViewBST tree = new topViewBST();
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            int depth = scanner.nextInt();
            tree.insert(value, depth);
        }
        tree.topView();
        scanner.close();
    }
}
