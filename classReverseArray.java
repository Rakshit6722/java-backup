import java.util.*;

public class classReverseArray {
    public static int[] reverse(int arr[]){
        int res[] = new int[arr.length];
        int i = arr.length-1;
        int idx = 0;
        while(i>=0){
            res[idx] = arr[i]; 
            idx++;
            i--;
        }
        arr = res;
        return arr;

    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        reverse(arr);
        print(arr);

    }
}
