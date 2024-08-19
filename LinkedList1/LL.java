package LinkedList1;

public class LL {
    private Node head;
    private Node tail;

    private int size;

    
    public LL() { // initialize size everytime a linked list is created
        this.size = 0;
    }


    //INSERTION

    //inserting at first position
    public void insertFirst(int val){
        Node node = new Node(val); //create a new node
        node.next = head; //point node.next -> current head
        head = node;//make node new head

        if(tail==null){//if there is not tail then tail and head will be pointing to same node
            tail = head;
        }

        size++;//incrementing the size as new node are added to the LL
    }

    //inserting at last position
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;  
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node ;
        size++;
    }

    //insert at given index
    public void insertAt(int val, int idx){
        if(idx==0){
            insertFirst(val);
            return;
        }
        if(idx==size){
            insertLast(val);
        }
        Node temp = head;
        int i = 1;
        while(i<idx){
            temp = temp.next;
            i++;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }


    //DELETION

    //delete first
    public int deleteFirst(){
        int val = head.value;//fetching the value of head to be deleted
        head = head.next;
        if(head==null){
            tail = null;
        }
        size--;
        return val;//returning deleted value;
    }

    //to get a particular reference of an index
    public Node get(int idx){
        Node temp = head;
        for(int i=0;i<idx;i++){
            temp = temp.next;
        }
        return temp;
    }

    //delete last
    public int deleteLast(){
        if(size<=1){//if it has only one element
            return deleteFirst();
        }
        Node secondLast = get(size-2);//get to index before the current tail 
        int val = tail.value;
        tail = secondLast; //point tail to new node
        tail.next=null; //point new node tail to null
        size--;
        return val;
    }

    //delete at given index
     public int deleteAt(int idx){
        if(idx==1){
            return deleteFirst();
            
        }
        if(idx==size){
            return deleteLast();
            
        }
        Node prev = get(idx-1);//reach one node prev to node to be deleted
        int val = prev.next.value;//get deleted node value
        prev.next = prev.next.next;//point current node to node.next.next
        size--;
        return val;
     }



    //print linked list
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.print("NULL");
    }

    //find particular node
    public Node find(int val){
        Node temp = head;
        while(temp!=null){
            if(temp.value==val){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public boolean hasCycle(Node head){
        Node slow = head;
        Node fast = head;
        
    }
    

    //Node class
    public class Node {
        public int value;
        public Node next;

        // 'this' keyword is used to access and manipulate instance variables and to call
        // constructors of the current instance (object) of a class.

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}