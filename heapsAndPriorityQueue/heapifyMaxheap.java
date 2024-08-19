import java.util.Scanner;

public class heapifyMaxheap {

    static void heapify(int[] arr, int n, int i){
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if(left<n && arr[left]>arr[largest]){
            largest = left;
        }
        if(right<n && arr[right]>arr[largest]){
            largest = right;
        }
        if(i!=largest){
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;

             heapify(arr, n, largest);
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
