import java.util.*;

public class sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // basic sorts

        // bubble sort
        // pushes the smallest element back with repeatedly swapping
        // time complexity -> O(n^2)
        // for (int i = 0; i < n - 1; i++) {
        // for (int j = 0; j < n - i - 1; j++) {
        // if (arr[j] > arr[j + 1]) {
        // int temp = arr[j];
        // arr[j] = arr[j + 1];
        // arr[j + 1] = temp;
        // }
        // }
        // }

        // selection sort
        // finds the smallest element and swaps at end of iteration
        // one swap per iteration
        // time complexity -> O(n^2)
        // for(int i=0;i<arr.length-1;i++){
        // int smallest = i;
        // for(int j=i+1;j<arr.length;j++){
        // if(arr[smallest]>arr[j]){
        // smallest = j;
        // }
        // }
        // int temp = arr[smallest];
        // arr[smallest] = arr[i];
        // arr[i] = temp;
        // }

        // insertion sort
        // divides array in two parts sorted part and unsorted part
        // time complexity -> O(n^2)
        // for(int i=0;i<arr.length;i++){
        // int current = arr[i];
        // int j = i-1;
        // while(j>=0 && current < arr[j]){
        // arr[j+1] = arr[j];
        // j--;
        // }

        // arr[j+1] = current;
        // }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
