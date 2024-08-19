import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

import javax.naming.LinkException;

class Node {
    int data;
    int hd;
    Node left;
    Node right;

    public Node(int val) {
        this.data = val;
        this.hd = Integer.MAX_VALUE;
        left = right = null;
    }
}

public class bottomView {

    static ArrayList<Integer> bottomViewTraversal(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        // int hd = 0;
        if (root == null)
            return ans;
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Node> q = new LinkedList<>();
        root.hd = 0;
        q.add(root);
        while (!q.isEmpty()) {
            Node temp = q.remove();
            int hd = temp.hd;
            map.put(hd, temp.data);
            if (temp.left != null) {
                temp.left.hd = hd - 1;
                q.add(temp.left);
            }
            if (temp.right != null) {
                temp.right.hd = hd + 1;
                q.add(temp.right);
            }

        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
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
        System.out.println(bottomViewTraversal(root));
    }
}
