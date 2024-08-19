import java.io.*;
import java.util.*;

class  pathSum{
    static class node {
        int key;
        node left, right;
    };

    static node newNode(int item) {
        node temp = new node();
        temp.key = item;
        temp.left = temp.right = null;
        return temp;
    }

    static node insert(node node, int key) {
        if (node == null)
            return newNode(key);
        if (key < node.key) {
            node.left = insert(node.left, key);
        } else if (key > node.key) {
            node.right = insert(node.right, key);
        }
        return node;
    }

    static int pathSum(node root, int[] arr){
        if(root==null) return 0;

        int lh = pathSum(root.left, arr);
        int rh = pathSum(root.right, arr);
        arr[0] = Math.max(arr[0],lh+rh+root.key);
        return root.key + Math.max(lh, rh);
    }

    static boolean hasPathSum(node root, int targetSum) {
        // Enter your code here
        int[] sum = new int[1];
        int val = pathSum(root, sum);
        if(val==targetSum) return true;
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        node root = null;
        while (N != 0) {
            root = insert(root, sc.nextInt());
            N--;
        }
        int targetSum = sc.nextInt();
        System.out.println(hasPathSum(root, targetSum));
    }
}