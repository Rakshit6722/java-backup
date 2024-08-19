package stacksImplementation;

public class queueImplementationUsingArray {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        // System.out.println(q.top());
        q.pop();
        System.out.println(q.top());

    }
}
class Queue{
    int size = 10000;
    int[] arr = new int[size];
    int count = 0;
    int rear = 0;
    int front = 0;

    void push(int x){
        if(count==size){
            System.out.println("Queue is full");
            return;
        }
        arr[rear%size] = x;
        rear++;
        count++;

    }
    void pop(){
        if(count==0){
            System.out.println("No element present");
            return;
        }
        front++;
        count--;
    }
    int top(){
        return arr[front%size];
    }
    int size(){
        return count;
    }
}
