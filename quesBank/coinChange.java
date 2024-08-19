import java.util.Scanner;

public class coinChange {

    static int noOfWays(int[] arr,  int target){
        // int count = 0;
        return coinChange(arr, 0, target);
        // return count;
    }

    static int coinChange(int[] arr,int idx, int target){
        if(idx==arr.length){
            if(target==0){
                // count++;
                return 1;
            }
            return 0;
        }
        int waysInclude = 0;
        if(arr[idx]<=target){
            // count++;
            waysInclude = coinChange(arr, idx, target-arr[idx]);
            // count--;
        }
        int waysExclude = coinChange(arr, idx+1, target);

        return waysInclude+waysExclude;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(noOfWays(arr,target));
    }
}
