import java.util.*;

public class LL2 {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public static Node last(Node head, int k){
        Node fast = head;
        Node slow = head;

        for(int i=0;i<k;i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
    
        }
        return slow;
    }

    public static void printList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void displayR(Node head){
        Node temp = head;
        if(temp.next==null){
            System.out.print(temp.data);
            return;
        }
        
        System.out.print(temp.data+" ");
        displayR(temp.next);
    }

    public static void reverseDisplay(Node head){
        if(head == null) return;
        reverseDisplay(head.next);
        System.out.print(head.data+" ");
    }

    public static int listLength(Node head){
        int count = 0;
        Node temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    //insert at end if only head is given
    public static void insertAtEnd(Node head, int val){
        Node t = new Node(val);
        Node temp = head;
         while(temp.next!=null){
            temp = temp.next;
         }
         temp.next = t;

    }


    public static void main(String[] args) {
        // Node a = new Node(2);
        // Node b = new Node(4);
        // Node c = new Node(3);
        // Node d = new Node(5);
        // Node e = new Node(6);

        // //2 4 3 5 6

        // a.next = b; 
        // //2 -> 4 3 5 6
        // // System.out.println(a);
        // // System.out.println(a.next);
        // // System.out.println(b);
        // // System.out.println(c);
        // //System.out.println(a.next.data);

        // b.next = c; //2 -> 4 -> 3 5 6
        // c.next = d; //2 -> 4 -> 3 -> 5 6
        // d.next = e; //2 -> 4 -> 3 -> 5 -> 6

        //Displaying Linked List with help of head Node

        // Node temp = a;
        // for(int i=1;i<=5;i++){
        //     System.out.print(temp.data+" ");
        //     temp = temp.next;
        // }

        // while(temp!=null){
        //     System.out.print(temp.data+" -> ");
        //     temp = temp.next;
        // }
        // printList(a);
        // System.out.println();

        // //diplaying link recursively
        // displayR(a);

        // //diplay reverse recursively
        // System.out.println();
        // reverseDisplay(a);

        // //length of a linked list
        // System.out.println();
        // int length = listLength(a);
        // System.out.println("length : "+length);

        // insertAtEnd(a,89);
        // displayR(a);

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(-1);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        Node lastelment = last(a, 4);
        System.out.println(lastelment.data);
        
    }
}
