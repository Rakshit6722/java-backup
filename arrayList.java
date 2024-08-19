import java.util.*;
import java.util.ArrayList;

public class arrayList {

    public static void main(String[] args) {
        // declaration
        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<String> list2 = new ArrayList<String>();
        // ArrayList<Boolean> list3 = new ArrayList<Boolean>();4

        //add elements
        list.add(0);
        list.add(1);
        list.add(2);

        System.out.println(list);

        //get elements
        int element = list.get(1);
        System.out.println(element);

        //add elements in between
        list.add(0,1);
        System.out.println(list);

        //set element
        list.set(0,5);
        System.out.println(list);

        //delete element
        list.remove(0);
        System.out.println(list);

        // size
        int size = list.size();
        System.out.println(size);

        //loops
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
    
}
