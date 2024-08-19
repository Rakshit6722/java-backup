// import java.util.*;

// public class practice2 {

//     public static class Node{
//         int data;
//         Node next;

//         Node(int data){
//             this.data = data;
//         }
//     }

//     public static class linkedlist{
//         Node head = null;
//         Node tail = null;
//         void display(){
//             Node temp = head;
//             while(temp!=null){
//                 System.out.print(temp.data + " ");
//                 temp = temp.next;
//             }
//             System.out.println();
//         }

//         int size(){
//             Node temp = head;
//             int count = 0;
//             while(temp!=null){
//                 count++;
//             }
//             return count;
//         }
    
//          void insertAtStart(int data){
//             Node t = new Node(data);
//             if(head == null){
//                 head = t;
//                 tail = t;
//             }
//             else{
//                 t.next = head;
//             }
//             head = t;
//         }

//         void insertAtEnd(int data){
//             Node t = new Node(data);
//             if(head == null){
//                 head = t;
//                 tail = t;
//             }
//             else{
//                 tail.next = t;
//             }
//             tail = t;
//         }

//         void insertAtInd(int data, int idx){
//             Node t = new Node(data);
//             Node temp = head;
//             if(idx==size()){
//                 insertAtEnd(data);
//                 return;
//             }
//             else if(idx==0){
//                 insertAtStart(data);
//                 return;
//             }
//             else if(idx<0 || idx>size()){
//                 System.out.println("wrong index");
//                 return;
//             }
//             for(int i=1;i<=idx-1;i++){
//                 temp = temp.next;
//             }
//             t.next = temp.next;
//             temp.next = t;
//         }
//     }




    
//     public static void main(String[] args) {

//         linkedlist ll = new linkedlist();
//         ll.insertAtStart(1);
//         ll.insertAtStart(2);
//         ll.insertAtStart(3);
//         ll.insertAtEnd(15);

//         ll.display();
//         ll.insertAtInd(11, 2);
//         ll.display();

        

//     }
// }

import java.util.*;

public class practice2{
    public static void main(String[] args) {
        pattern(4, 0);
        int[] arr = {5,4,3,2,1};
        // bubbleSort(arr, arr.length-1, 0);
        // System.out.println(Arrays.toString(arr));
        selectionSort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
        

        
    }

    static void pattern(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*");
            pattern(r, c+1);
        }
        else{
            System.out.println();
            pattern(r-1, 0);
        }
    }

    static void bubbleSort(int[] arr, int r, int c){
        if(r==0) return;

        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubbleSort(arr, r, c+1);
        }
        else{
            bubbleSort(arr, r-1, 0);
        }
    }

    static void selectionSort(int[] arr, int r, int c, int max){
        if(r==0) return;

        if(c<r){
            if(arr[c]>arr[max]){
                selectionSort(arr, r, c+1, c);
            }
            else{
                selectionSort(arr, r, c+1, max);
            }
        }
        else{
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;

            selectionSort(arr, r-1, 0, 0);
        }
    }
}
