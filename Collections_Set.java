import java.util.*;

public class Collections_Set {

    static void setExamples(){
         

        //HashSet - unordered collection of unique elements
        // HashSet<Integer> st = new HashSet<>();
        TreeSet<Integer> st = new TreeSet<>();
        st.add(10);
        st.add(2);
        st.add(4);
        st.add(4);
        st.add(1);
        st.remove(2);
        st.remove(Integer.valueOf(7));
        System.out.println(st);
        // System.out.println(st.size());
        // System.out.println(st.contains(1));
    }
    
    public static void main(String[] args) {
        setExamples();
    }
}
