import java.util.*;

public class practiceRecursion {
    public static void main(String[] args) {
        int[] arr = {12,31,1,4,24,12};
        // arr = mergeSort(arr);
        // quickSort(arr, 0, arr.length-1);
        // bubbleSort(arr, arr.length-1, 0);
        // selectionSort(arr, arr.length, 0, 0);
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    // static int[] mergeSort(int[] arr){
    //     if(arr.length == 1){
    //         return arr;
    //     }
    //     int mid = arr.length/2;

    //     int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
    //     int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

    //     return merge(left, right);
    //     }

    // private static int[] merge(int[] left, int[] right) {
    //     int mix[] = new int[left.length+right.length];

    //     int i=0;
    //     int j=0;
    //     int k=0;

    //     while(i<left.length && j<right.length){
    //         if(left[i]<right[j]){
    //             mix[k] = left[i++];
    //         }
    //         else{
    //             mix[k] = right[j++];
    //         }
    //         k++;
    //     }

    //     while(i<left.length){
    //         mix[k++] = left[i++];
    //     }
    //     while(j<right.length){
    //         mix[k++] = right[j++];
    //     }
    //     return mix;


    // }

    static void quickSort(int[] arr, int low, int high){
        if(low>=high) return;

        int s = low;
        int e = high;
        int m = s + (e-s) / 2;
        int pivot = arr[m];

        while(s<=e){
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        quickSort(arr, low, e);
        quickSort(arr, s, high);
    }

    static void bubbleSort(int[] arr, int low, int hi){
        if(low==0) return;

        if(hi<low){

            if(arr[hi]>arr[hi+1]){
                int temp = arr[hi];
                arr[hi] = arr[hi+1];
                arr[hi+1] = temp;
            }
            bubbleSort(arr, low, hi+1);
        }
        else{
            bubbleSort(arr, low-1, 0);
        }
        
    }

    static void selectionSort(int[] arr, int r, int c, int max){
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
    static int[] mergeSort(int[] arr){
        if(arr.length==1) return arr;

        int m = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, m));
        int[] right = mergeSort(Arrays.copyOfRange(arr, m, arr.length));

        return merge(left, right);

    }

    private static int[] merge(int[] left, int[] right) {

        int mix[] = new int[left.length+right.length];
        // return null;
        int i = 0;
        int j = 0;
        int k = 0;

        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                mix[k] = left[i++];
            }
            else{
                mix[k] = right[j++];
            }
            k++;
        }
        while(i<left.length){
            mix[k++] = left[i++];
        }
        while(j<right.length){
            mix[k++] = right[j++];
        }
        return mix;
    }
}
