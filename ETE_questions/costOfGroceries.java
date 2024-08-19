import java.util.*;

public class costOfGroceries {
    static int cost(int[] arr1, int[] arr2, int x){
        int idx = -1;
        for(int i=0;i<arr1.length;i++){
            if(x<=arr1[i]){
                idx = i;
                break;
            }
        }
        return arr2[idx];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] fresh = new int[n];
        for(int i=0;i<n;i++){
            fresh[i] = sc.nextInt();
        }
        int[] cost = new int[n];
        for(int i=0;i<n;i++){
            cost[i] = sc.nextInt();
        }
        System.out.println(cost(fresh,cost,x));
    }
}
