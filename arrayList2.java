import java.util.*;

public class arrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        //add new element
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);

        // add element at some given index
        arr.add(1,14);

        //modifying element at given index
        arr.set(1,10);

        //remove an element at index i
        arr.remove(1);

        //remove an element e
        arr.remove(Integer.valueOf(7));

        //index of
        int ar = arr.indexOf(Integer.valueOf(6));
        System.out.println(ar);

        //checking if an elmenet exist
        boolean exist = arr.contains(Integer.valueOf(6));
        System.out.println(exist);

        //get an element at index i
        System.out.println(arr.get(2));

        //simple print list directly
        System.out.println(arr);


        //print with for loop
        // for(int i=0;i<arr.size();i++){
        //     System.out.println(arr.get(i));
        // }
    }
}
