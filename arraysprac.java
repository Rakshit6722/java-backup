//KEY NOTE
//invalid array index access is not allowed in java


import java.util.*;

public class arraysprac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        // max and min element
        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;

        // for(int i=0;i<n;i++){
        // arr[i] = sc.nextInt();
        // }

        // for(int i=0;i<n;i++){
        // if(arr[i]>max){
        // max = arr[i];
        // }
        // }

        // for(int i=0;i<n;i++){
        // if(arr[i]<min){
        // min = arr[i];
        // }
        // }

        // System.out.println("max element : "+max);
        // System.out.println("min element : "+min);

        
        // chech whether array is sorted
        // boolean flag = true;

        // for(int i=0;i<n-1;i++){
        //     if(arr[i]>arr[i+1]){
        //         flag = false;
        //         break;
        //     }
        
        // }

        // if(flag){
        //     System.out.println("Array is sorted");
        // }
        // else{
        //     System.out.println("Array is not sorted");
        // }
        

    }
}
