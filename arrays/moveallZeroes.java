package arrays;
import java.util.*;

public class moveallZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        // int[] res = move(arr, n);
        // System.out.println(Arrays.toString(res));
        swap(arr, n);
        System.out.println(Arrays.toString(arr));

    }
    static int[] move(int[] arr, int n){
        ArrayList<Integer> res = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                res.add(i);
            }
        }
        int s = res.size();
        for(int i = 0;i<s;i++){
            arr[i] = res.get(arr[i]);
        }

        for(int i=s;i<n;i++){
            arr[i] = 0;
        }
        return arr;
    }

    //optimal soln
    static void swap(int[] arr, int n){
        int i=0;
        int j=1;
        while(i<arr.length-1){
            if(arr[j]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            i++;
            j++;
        }
    }
    
}
