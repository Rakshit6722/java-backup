import java.util.*;
public class makeEqual {

    static boolean isEqual(int[] arr, int n){
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                arr[i]/=2;
            }
            if(arr[i]%3==0){
                arr[i]/=3;
            }
        }
        int ele = arr[0];
        for(int i=0;i<n;i++){
            if(ele!=arr[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        if(isEqual(arr,n)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
