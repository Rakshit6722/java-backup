package sorting;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {

        int[] arr = {5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void sort(int[] arr){
        
        for(int i=0;i<arr.length-1;i++){
            int min = i;
            for(int j = i+1; j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        
    }
}
