import java.util.Arrays;

public class heapsImplementaion{
    public static void heapify(int[] arr, int n, int i) {
        int smallest = i;  // Initialize smallest as root
        int left = 2 * i + 1;  // Left child index
        int right = 2 * i + 2;  // Right child index
    
        if (left < n && arr[left] < arr[smallest]) {
            smallest = left;
        }
    
        if (right < n && arr[right] < arr[smallest]) {
            smallest = right;
        }
    
        if (smallest != i) {
            // Swap the root with the smallest child
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
    
            // Recursively heapify the affected subtree
            heapify(arr, n, smallest);
        }
    }
    

    public static void buildHeap(int[] arr, int n) {
        // Start from the last non-leaf node and heapify all subtrees
        for (int i = (n / 2) - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {12,534,32,2,123};
int n = arr.length;
buildHeap(arr, n);
for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
}

// Now arr represents a min heap: {5, 6, 11, 13, 12, 7}

    }
}

