package arrays;
import java.util.*;

import java.util.Arrays;
import java.util.HashSet;

public class removeDulplicates {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3,3,3};
        int n = remove(arr,6);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(set(arr, n));
        
    }

    static int remove(int[] arr, int n){
        //return n if array is empty or conatin single element
        if(n==0 || n==1){
             return n;
        }

        //create a temp array
        int[] temp = new int[n];

        //start traversing and add unique elements to temp array
        
        int j = 0;
        for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        //add the last element to temp array
        temp[j++] = arr[n-1];

        //modify the original array
        for(int i=0;i<j;i++){
            arr[i] = temp[i];
        }

        //size of new array
        return j;
    }

    //optimized soln
    static HashSet<Integer> set(int[] arr, int n){
        HashSet<Integer> res = new HashSet<>();
        // for(int element : arr){
        //     res.add(element);
        // }
        for(int i=0;i<n;i++){
            res.add(arr[i]);
        }
        return res;
    } 
}
