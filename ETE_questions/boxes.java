import java.util.*;

public class boxes {
    static double pair(double n){
        return Math.ceil(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        double sum = 0;
        for(int i=0;i<n;i++){
            double temp = arr[i]/2;
            sum+=pair(n);
        }
        System.out.println(sum);
    }
}
