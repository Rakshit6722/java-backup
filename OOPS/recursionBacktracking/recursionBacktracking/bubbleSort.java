package recursionBacktracking;
import java.util.*;

public class bubbleSort {
    public static void main(String[] args) {

        int arr[] = {5,4,3,2,1};
        sort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
        
    }

    static void sort(int arr[], int s, int e){
        if(s==0){
            return;
        }
        if(e<s){
            if(arr[e]>arr[e+1]){
                int temp = arr[e];
                arr[e]=arr[e+1];
                arr[e+1]=temp;
            }

            sort(arr, s, e+1);
        }
        else{
            sort(arr, s-1, 0);
        }
    }
}
