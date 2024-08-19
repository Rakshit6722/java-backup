package recursionBacktracking;

import java.util.*;

public class linearSearch {
    public static void main(String[] args) {
        int arr[] = { 12, 4,4, 1, 2 };
        System.out.println(search(arr, 4, 0));
        System.out.println(index(arr, 4, 0));
        // findAllIndex(arr, 4, 0);
        // System.out.println(list);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(findAllIndex(arr, 4, 0, list));
    }

    static boolean search(int[] arr, int target, int index) {

        if (index == arr.length) {
            return false;
        }

        return arr[index] == target || search(arr, target, index + 1);
    }

    static int index(int[] arr, int target, int index) {

        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }

        else {

            return index(arr, target, index + 1);
        }
    }

    // first approach
    //makind an arraylist outside the function 
    // static ArrayList<Integer> list = new ArrayList<>();
    // static void findAllIndex(int[] arr, int target, int index){
    //     if(index==target){
    //         return;
    //     }
    //     if(arr[index] == target){
    //         list.add(index);
    //     }
    //     findAllIndex(arr, target, index+1);
    // }

    //second approach
    //giving an arraylist as a parameter in funciton call
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr, target, index+1, list);
    }

    //third approach
    //making arraylist in function body
    //
    static ArrayList<Integer> findAll(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> list2 = findAll(arr, target, index+1);
        list.addAll(list2);
        return list;
    }
}
