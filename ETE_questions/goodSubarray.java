import java.util.*;
public class goodSubarray {

    static int good(int[] arr, int k){
        int count = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            Set<Integer> set = new HashSet<>();
            for(int j=i;j<n;j++){
                set.add(arr[j]);
                int size = set.size();
                if(size == k) count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(good(arr,k));
    }    
}
