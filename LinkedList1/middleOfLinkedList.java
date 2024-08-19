package LinkedList1;
import java.util.*;

import LinkedList1.LL.Node;

//find middle node of linked list
public class middleOfLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);       
        list.add(2);       
        list.add(3);       
        list.add(4);       
        list.add(5);       
    }

    //to find size of linked list
    static int size(Node head){
        int count = 0;
        Node temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    //to find middle element
    static Node middle(Node head){
        int n = size(head)/2;
        Node temp = head;
        for(int i=0;i<n;i++){
            temp = temp.next;
        }
        return temp;
    }

}
