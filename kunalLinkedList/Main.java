class LL{
    Node head;
    Node tail;

    int size = 0;

    public LL(){
        this.size=0;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.print("null"); 
    }

    public void insertAtBeginning(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail==null){
            tail = head;
        }
        
        
        size++;
    }
    public void insertAtLast(int value){
        Node node = new Node(value);
        if(tail==null){
            insertAtBeginning(value);
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAtIndex(int value, int idx){
        Node node = new Node(value);
        if(idx==0){
            insertAtBeginning(value);
            return;
        }
        if(idx==size){
            insertAtLast(value);
            return;
        }
        Node prev = head;
        for(int i=1;i<idx;i++){
            prev = prev.next;
        }
        Node ahead = prev.next;
        prev.next = node;
        node.next = ahead;
    }

    public void insertRecursive(int value,int idx){
        if(idx==0){
            insertAtBeginning(value);
            return;
        }
        if(idx==size){
            insertAtLast(value);
            return;
        }
        Node temp = head;
        solve(value,idx,0,temp);
    }
    public void solve(int value, int idx, int st, Node temp){
        if(st==idx-1){
            Node node = new Node(value);
            Node ahead = temp.next;
            temp.next = node;
            node.next = ahead;
            size++;
            return;
        }
        solve(value,idx,st+1,temp.next);
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head==null) tail=null;
        size--;
        return val;
    }

    public int deleteLast(){
        int val = tail.value;
        int idx = size-2;
        Node secondLast = head;
        for(int i=1;i<idx;i++){
            secondLast=secondLast.next;
        }
        tail = secondLast;
        tail.next = null;
        return val;
    }
    public int delete(int idx){
        Node temp = head;
        for(int i=1;i<idx;i++){
            temp = temp.next;
        }
        int val = temp.next.value;
        temp.next = temp.next.next;
        return val;
    }
    
}

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtBeginning(2);
        list.insertAtBeginning(5);
        list.insertAtLast(6);
        list.insertAtLast(7);
        list.insertAtLast(8);
        // list.insertAtIndex(8, 5);
        // list.deleteFirst();
        // list.deleteLast();
        // list.display();
        // int val= list.delete(2);
        // System.err.println();
        list.display();
        System.out.println();
        list.insertRecursive(4, 4);
        list.display();



    }
}
