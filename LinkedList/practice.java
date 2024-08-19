import java.util.*;

public class practice {

    // public static class Node {
    //     int data;
    //     Node next;

    //     Node(int data) {
    //         this.data = data;
    //     }
    // }

    // public static Node last(Node head, int k){
    //     Node fast = head;
    //     Node slow = head;

    //     for(int i=0;i<k;i++){
    //         fast = fast.next;
    //     }
    //     while(slow.next!=null){
    //         slow = slow.next;
    //         fast = fast.next;
    
    //     }
    //     return slow;
    // }

    // public static class linkedlist {
    //     Node head = null;
    //     Node tail = null;
    //     int size = 0;

    //     void insertAtEnd(int data) {
    //         Node temp = new Node(data);
    //         if (head == null) {
    //             head = temp;
    //             tail = temp;
    //         } else {
    //             tail.next = temp;
    //         }
    //         tail = temp;

    //     }

    //     void insertAtBegin(int data) {
    //         Node temp = new Node(data);
    //         if (head == null) {
    //             head = temp;
    //             tail = temp;
    //         } else {
    //             temp.next = head;
    //         }
    //         head = temp;

    //     }

    //     int size() {
    //         int count = 0;
    //         Node temp = head;
    //         while (temp != null) {
    //             count++;
    //             temp = temp.next;
    //         }
    //         return count;
    //     }

    //     void insertAt(int idx, int data) {
    //         Node t = new Node(data);
    //         Node temp = head;

    //         if (idx == size()) {
    //             insertAtEnd(data);
    //             return;
    //         } else if (idx == 0) {
    //             insertAtBegin(data);
    //             return;
    //         }

    //         for (int i = 1; i <= idx - 1; i++) {
    //             temp = temp.next;
    //         }
    //         t.next = temp.next;
    //         temp.next = t;

    //     }

    //     int getElement(int idx) {
    //         Node temp = head;
    //         for (int i = 1; i <= idx; i++) {
    //             temp = temp.next;
    //         }
    //         return temp.data;
    //     }

    //     void display() {
    //         Node temp = head;
    //         while (temp != null) {
    //             System.out.print(temp.data + " ");
    //             temp = temp.next;
    //         }
    //     }
    // }

    // public static void main(String[] args) {
    //     // linkedlist ll = new linkedlist();
    //     // ll.insertAtEnd(12);
    //     // //ll.insertAtEnd(12);
    //     // ll.insertAtBegin(14);
    //     // ll.insertAt(1, 2);
    //     // ll.display();
    //     // System.out.println();
    //     // System.out.println(ll.getElement(2));

    //     // Node a = new Node(1);
    //     // Node b = new Node(2);
    //     // Node c = new Node(3);
    //     // Node d = new Node(4);
    //     // Node e = new Node(5);
    //     // Node f = new Node(6);
    //     // Node g = new Node(-1);

    //     // a.next = b;
    //     // b.next = c;
    //     // c.next = d;
    //     // d.next = e;
    //     // e.next = f;
    //     // f.next = g;
    //     // Node lastelment = last(a, 4);
    //     // System.out.println(lastelment.data);

        
    // }

    static ArrayList<String> subSequence(String s){
        ArrayList<String> ans = new ArrayList<>();
        generate(s,"",0,ans);
        return ans;
    }

    private static void generate(String s, String string, int i, ArrayList<String> ans) {
        if(i==s.length()){
            ans.add(string);
            return;
        }
        generate(s, string+s.charAt(i), i+1, ans);
        generate(s, string, i+1, ans);
    }

    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> ans = subSequence(str);
        ArrayList<String> perm = perm(str);

        System.out.println(ans);
        System.out.println(perm);
    }

    static ArrayList<String> perm(String str){
        ArrayList<String> ans = new ArrayList<>();
        generatePermutation("", str, ans);
        return ans;
    }

    static void generatePermutation(String prefix, String remaining, ArrayList<String> ans){
        int n = remaining.length();
        if(n==0){
            ans.add(prefix);
        }
        else{
            for(int i=0;i<n;i++){
                generatePermutation(prefix+remaining.charAt(i), remaining.substring(0, i)+remaining.substring(i+1, n), ans);
            }
        }
    }
}
