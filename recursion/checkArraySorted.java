import java.util.*;

public class checkArraySorted {

    //time complexity -> O(n);

    public static boolean arraySort(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]<arr[i+1]){
            return arraySort(arr, i+1);
        }
        else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,6,5};
        System.out.println(arraySort(arr, 0));
    }
}
