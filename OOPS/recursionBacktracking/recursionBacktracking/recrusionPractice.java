package recursionBacktracking;

import java.util.*;

public class recrusionPractice {
    public static void main(String[] args) {
        pattern(4, 0);
        pattern1(4, 0);
        System.out.println();
        int arr[] = { 324, 12, 1, 12, 32, 41, 12, 41 };
        bubbleSort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
        selectionSort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));

    }

    static void pattern(int r, int c) {
        if (r == 0)
            return;

        if (c < r) {
            System.out.print("*");
            pattern(r, c + 1);
        } else {
            System.out.println();
            pattern(r - 1, 0);
        }
    }

    static void pattern1(int r, int c) {
        if (r == 0)
            return;

        if (c < r) {
            pattern1(r, c + 1);
            System.out.print("*");
        } else {
            pattern1(r - 1, 0);
            System.out.println();
        }
    }

    static void bubbleSort(int arr[], int r, int c) {
        if (r == 0)
            return;

        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;

            }
            bubbleSort(arr, r, c + 1);

        } else {
            bubbleSort(arr, r - 1, 0);
        }
    }

    static void selectionSort(int arr[], int r, int c, int max){
        if(r==0) return;

        if(c<r){
            if(arr[c]>arr[max]){
                selectionSort(arr, r, c+1, c);
            }
            else{
                selectionSort(arr, r, c+1, max);
            }
        }
        else{
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;

            selectionSort(arr, r-1, 0, 0);
        }
    }
}
