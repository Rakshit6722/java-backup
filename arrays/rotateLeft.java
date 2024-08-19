package arrays;

import java.util.Arrays;

public class rotateLeft {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rotate(arr, 5,2);
        System.out.println(Arrays.toString(arr));
        
    }
    static void rotate(int[] arr, int n, int k){
        int[] temp = new int[n];

        for(int x = 0;x<k;x++){

            int j = 0;
            for(int i=0;i<n-1;i++){
                temp[j++] = arr[i+1];
            }
            temp[j] = arr[0];
        }

        for(int i=0;i<n;i++){
            arr[i] = temp[i];
        }

    }
}
