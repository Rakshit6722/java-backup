import java.util.*;

public class nthNodefromLast {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    // public static Node nthnode(Node head, int n){
    //     int size = 0;
    //     Node temp = head;
    //     while(temp!=null){
    //         size++;
    //         temp = temp.next;
    //     }
    //       int m = size - n + 1;
    //     temp = head;
    //     for(int i=1;i<=m-1;i++){
    //         temp = temp.next;
    //     }
    //     return temp;

    // }

    //optimized soln
    public static Node nthnode(Node head, int n){
        Node fast = head;
        Node slow = head;

        for(int i=1;i<=n;i++){ 
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next; 
        }
        return slow; 

    }

    //deleting the middle element
    public static void deleteMidEle(Node head){
        Node fast = head;
        Node slow = head;

        // for odd
        // while(fast.next.next.next!=null){
        //     slow = slow.next;
        //     fast = fast.next.next;
        // }
        // slow.next = slow.next.next;

        //for even right middle element
        // while(fast.next.next!=null){
        //     slow = slow.next;
        //     fast = fast.next.next;
        // }
        // slow.next = slow.next.next;

        // for even left middle element
        while(fast.next.next.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;



    }

    //intersection of two linked lists
    // public static Node interseciton(Node head1, Node head2){
    //     Node temp1 = head1;
    //     Node temp2 = head2;
    //     int count1=0, count2=0;

    //     while(temp1!=null){
    //         count1++;
    //         temp1 = temp1.next;
    //     } 
    //     while(temp2!=null){
    //         count2++;
    //         temp2 = temp2.next;
    //     }
    //     temp1 = head1;
    //     temp2 = head2;
    //     if(count1>count2){
    //         for(int i=1;i<=count1-count2;i++){
    //             temp1 = temp1.next;
    //         }
    //     }
    //     else{
    //         for(int i=1;i<=count2-count1;i++){
    //             temp2 = temp2.next;
    //         }
    //     }
    //     while(temp1!=temp2){
    //         temp1 = temp1.next;
    //         temp2 = temp2.next;
    //     }
    //     return temp1;
    // }

    //middle element
    public static Node middleEle(Node head){
        Node fast = head;
        Node slow = head;
        Node temp = head;

        //odd 
        // while(fast.next!=null){
        //     slow=slow.next;
        //     fast=fast.next.next;
        // }

        //even right middle
        // while(fast!=null){
        //     slow=slow.next;
        //     fast=fast.next.next;
        // }
        // return slow;

        //even left middle
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;

        // int count=0;
        // while(temp!=null){
        //     count++;
        //     temp = temp.next;
        // }temp = head;

        // while(fast!=null && fast.next!=null){
        //     fast = fast.next.next;
        //     slow = slow.next;
        // }

        //for odd linked list
        // if(count%2!=0){
        //     while(fast.next!=null && fast!=null){
        //         slow = slow.next;
        //         fast = fast.next.next;
        //     }
        // }
        // else{
        //     //even linked list middle right element
        //     // while(fast!=null){
        //     //     slow = slow.next;
        //     //     fast = fast.next.next;
        //     // }

        //     //even linked list middle left element
        //     while(fast.next.next!=null && fast!=null){
        //         slow = slow.next;
        //         fast = fast.next.next;
        //     }
        // }
        
    }


    //remove nth node from end of linked list
    // public static Node nthdelete(Node head, int n){
    //     Node fast = head;
    //     Node slow = head;


    //     for(int i=1;i<=n;i++){
    //         fast = fast.next;
    //     }
        
    //     if(fast==null){
    //         head = head.next;
    //         return head;
    //     }
    //     while(fast.next != null){
    //         fast = fast.next;
    //         slow = slow.next;
    //     }
    //     slow.next = slow.next.next;
    //     return head;

    // }

    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public static int size(Node head){
        int count = 0;
        Node temp = head;
        while(temp!=null){
            count++;
        }
        return count;
    }

  
    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(5);
        Node e = new Node(6);
        
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        

        Node g = new Node(10);
        Node h = new Node(12);
        Node i = new Node(3);
        Node j = new Node(15);
        e.next = g; 
        // g.next = h;
        // h.next = i;
        // i.next = j;
        display(a);
        // System.out.println();
        // Node temp = nthnode(a,2);
        // System.out.println(temp.data);
        // a = nthdelete(a, 5  );
        // display(a);
        // System.out.println();
        // Node data1 = interseciton(a, g);
        // System.out.println(data1.data);
        // Node q=middleEle(a);
        // System.out.println(q.data);

        deleteMidEle(a);
        System.out.println();
        display(a);

    }
}
