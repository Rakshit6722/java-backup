import java.util.*;

public class implementation {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;
        int size=0;
        void insertAtEnd(int data){
            Node temp = new Node(data);
            if(head == null){
                head = temp;
                tail = temp;
            }
             else{
                 tail.next = temp;
                }
                tail = temp;
                size++;

            }

        void insertAtBegin(int data){
            Node temp = new Node(data);
            if(head == null){
                temp = head;
                temp = tail;
            }
            else{
                temp.next = head;
            }
            head = temp;
            size++;
        }
        
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
        int size(){
            int count = 0;
            Node temp = head;
            while(temp!=null){
                count++;
                temp = temp.next;
            }
            return count;
            
        }

        //insert at any given index
        void insertA(int data, int idx){
            Node t = new Node(data);
            Node temp = head;
            if(idx==size()){
                insertAtEnd(data);
                return;
            }
            else if(idx==0){
                insertAtBegin(data);
                return;
            }
            else if(idx<0 || idx>size()){
                System.out.println("wrong index");
                return;
            }
            for(int i=1;i<=idx-1;i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }

        void deleteAt(int idx){
            Node temp = head;
            if(idx==size()){
                tail=temp;
                return;
            }
            else if(idx==0){
                tail = tail.next;
                return;
            }
            for(int i=1;i<=idx-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
    
        }

        int getelement(int idx){
            Node temp = head;
            for(int i=1;i<=idx;i++){
                temp = temp.next;
            }
            return temp.data;
        }
    }
    
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(1);
        ll.insertAtEnd(3);
        ll.insertAtEnd(90);
        ll.display();
        System.out.println();
        // // System.out.println(ll.size());
        // System.out.println();
        ll.insertAtBegin(12);
        ll.display();
        ll.insertA(18, 1);
        System.out.println( );
        ll.display();
        // ll.insertA(100,0);
        // System.out.println();
        // ll.display();
        // System.out.println();
        // System.out.println(ll.getelement(1));
        
        // System.out.println(ll.size);
        ll.deleteAt(2);
        System.out.println();
        ll.display();
        ll.deleteAt(3);
        System.out.println();
        ll.display();
        System.out.println();
        System.out.println(ll.tail.data);
        
        }
}
