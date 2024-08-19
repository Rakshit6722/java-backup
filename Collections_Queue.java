import java.util.*;

public class Collections_Queue {

    //FIFO
    //FIRST IN FIRST OUT

    static void queueExamples(){
        LinkedList<Integer> q = new LinkedList<>();
        // add elements
        q.offer(1);
        q.offer(2);
        q.offer(2);
        q.offer(2);
        q.offer(2);
        q.offer(2);
        q.offer(2);
        q.offer(2);
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.poll());//remove 1
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        System.out.println(q.size());


         
    }
    public static void main(String[] args) {
        queueExamples();
    }
}
