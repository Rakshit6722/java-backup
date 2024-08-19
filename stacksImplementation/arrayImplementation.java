package stacksImplementation;

public class arrayImplementation {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(2);
        // System.out.println(st.top());
        st.push(4);
        st.push(5);
        st.push(6);
        // System.out.println(st.top());
        st.pop();
        System.out.println(st.top());
        System.out.println(st.size());

    }

}
class Stack{
    int size = 10000;
    int[] arr = new int[size];
    int top = -1;

    void push(int x){
        ++top;
        arr[top] = x;
    }
    void pop(){
        top--;
    }
    int top(){
        return arr[top];
    }
    int size(){
        return top+1;
    }
    boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }
}
