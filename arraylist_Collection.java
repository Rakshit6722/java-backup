import java.util.*;

public class arraylist_Collection {
    // static void ArrayListExamples() {
    //     ArrayList<Integer> li = new ArrayList<>();
    //     li.add(1);
    //     li.add(1);
    //     li.add(1);
    //     System.out.println(li);
    //     System.out.println(li.get(1));
    //     li.set(1,2);
    //     System.out.println(li);
    //     System.out.println(li.contains(5));


    // }
    // static void LinkedListExamples() {
    //     LinkedList<Integer> li = new LinkedList<>();
    //     li.add(1);
    //     li.add(1);
    //     li.add(1);
    //     System.out.println(li);
    //     System.out.println(li.get(1));
    //     li.set(1,2);
    //     System.out.println(li);
    //     System.out.println(li.contains(5));


    // }
    static void StackExample(){

        //LIFO
        //LAST IN FIRST OUT

        Stack<String> st= new Stack();
        st.push("rakshit");
        st.push("sparsh");
        st.push("rakshit");
        System.out.println(st.peek());
        System.out.println(st);
        st.pop();
        st.pop();
        st.pop();
        System.out.println(st.size());
        System.out.println(st.empty());
        
    }

    public static void main(String[] args) {
        // ArrayListExamples();
        // LinkedListExamples();
        StackExample();
    }
}
