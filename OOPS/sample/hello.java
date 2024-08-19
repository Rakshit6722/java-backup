package sample;

import java.util.Arrays;

public class hello {
    public static void main(String[] args) {
        int[] arr = { 2,4,1,3,5};
        // System.out.println(inversion(arr));

    }

    //quick sort
    static void quickSort(int[] arr, int low, int high){
        if(arr.length==0) return;
        int s = low;
        int e = high;
        int m = s+(e-s)/2;
        int pivot = m;

        while()
    }
    

    // static int inversion(int[] arr) {
    //     int count = 0;
    //     for (int i = 0; i < arr.length-1; i++) {
    //         for (int j = i+1; j < arr.length ; j++) {
    //             if (arr[i] > arr[j]) {
    //                 // int temp = arr[j];
    //                 // arr[j] = arr[j + 1];
    //                 // arr[j + 1] = temp;
    //                 count ++;
    //             }
    //         }

    //     }
    //     return count;
    // }
}
