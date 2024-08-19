package arrays;

import java.util.Arrays;

public class leftrotatebyDplaces {
    public static void main(String[] args) {
        int[] arr = {1,3,6,11,12,17};
        rotate(arr, 6, 4);
        System.out.println(Arrays.toString(arr));
    }
    static void rotate(int[] arr, int n, int k){
        // d = d % n;

        // int[] temp = new int[d];
        // for(int i=0;i<d;i++){
        //     temp[i] = arr[i];
        // } 
        // for(int i=d;i<n;i++){
        //     arr[i-d] = arr[i];
        // }
        // // int j = 0;
        // for(int i=n-d;i<n;i++){
        //     arr[i] = temp[i-(n-d)];
        //     //or
        //     // arr[i] = temp[j++]
        // }
        k = k%n;
        int[] temp = new int[k];
        for(int i=0;i<k;i++){
            temp[i] = arr[i];
        }
        for(int i=k;i<n;i++){
            arr[i-k] = arr[i];
        }
        for(int i=n-k;i<n;i++){
            arr[i] = temp[i-(n-k)];
        }
    }
}
