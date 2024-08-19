package recursionBacktracking;
import java.util.*;

public class rotatedBinarySearch {
    public static void main(String[] args) {
          int[] arr = {5,6,7,8,1,2,3};
          System.out.println(search(arr, 10, 0, arr.length-1));

    }

    //function made by my own
    // static int search(int[] arr, int target, int s, int e){
    //     int m = s + (e-s)/2;

    //     if(s>e){
    //         return -1;
    //     }
    //     if(arr[m]==target){
    //         return m;
    //     }
        
    //     if(arr[s]<=arr[m]){
    //         if(target>arr[s] && target<arr[m]){
    //             e = m - 1;
    //         }
    //     }
    //     else{
    //         s = m + 1;
    //     }
    //     return search(arr, target, s+1, e);
    // }

    //the actual recursive function for this
    static int search(int[] arr, int target, int s, int e){
        int m = s + (e-s)/ 2;
        if(s>e){
            return -1;
        }
        if(arr[m] == target){
            return m;
        }

        if(arr[s]<=arr[m]){
            if(target>=arr[s] && target<=arr[m]){
                return search(arr, target, s, m-1);
            }
            else{
                return search(arr, target, m+1, e);
            }
        }

        if(target>=arr[m] && target<=arr[e]){
            return search(arr, target, s+1, e);
        }
        return search(arr, target, s, m-1);
    }
}
