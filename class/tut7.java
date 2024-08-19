
//recursion
import java.util.*;

public class tut7 {
    public static void main(String[] args) {
        // add(10, 20);
        int[] arr = { 10, 15, 18, 25, 30 };
        int val = 19;
        System.out.println(find(arr, val, 0));

    }

    // static void add(int a, int b){
    // int sum = a + b;
    // System.out.println(sum);
    // add(sum, b);
    // }
    static boolean find(int[] arr, int val, int index) {
        if (index == arr.length - 1) {
            return false;
        }

        if (arr[index] == val) {
            return true;
        }

        return find(arr, val, index + 1);

    }
}
