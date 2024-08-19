import java.util.*;
public class heapifyMinHeap {

    static void heapify(int[] arr, int n, int i){
        int smallest = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if(left < n && arr[left]<arr[smallest]){
            smallest = left;
        }
        if(right<n && arr[right]<arr[smallest]){
            smallest = right;
        }
        if(i!=smallest){
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

            heapify(arr, n, smallest);
        }
    }

    static void buildHeap(int[] arr, int n){
        for(int i=(n/2)-1;i>=0;i--){
            heapify(arr,n,i);
        }
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
    }
    buildHeap(arr,n);
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
   } 
}
