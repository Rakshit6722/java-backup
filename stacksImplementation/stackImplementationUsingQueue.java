package stacksImplementation;
import java.util.*;

//METHOD 1
//we'll need two queue to implement stack
//push(x) = we'll first push the element in second queue i.e. Q2, then move element from Q1 to Q2 and lastly swap all elements from Q2 to Q1
//pop = for pop we'll just Q1.pop();

//METHOD 2
//we'll only need one queue in this method
//refer copy notes for explaination as i am running out of time

public class stackImplementationUsingQueue {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(2);
        st.push(5);
        st.push(4);
        st.push(3);
        // System.out.println(st.top());
        st.pop();
        System.out.println(st.top());


    }
}

class Stack{
    Queue q = new Queue();
    void push(int x){
        q.push(x);
        for(int i = 0;i<q.size()-1;i++){
            q.push(q.top());
            q.pop();
        }
    }
    void pop(){
        q.pop();
    }
    int top(){
        return q.top();
    }

}