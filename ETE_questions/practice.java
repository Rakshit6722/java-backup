import java.util.ArrayList;
import java.util.Scanner;

public class practice {

    static int binary(int n){
        int currNum = 1;
        int count = 1;

        while(count<n){
            currNum++;

            String str = Integer.toBinaryString(currNum);
            if(str.equals(new StringBuilder(str).reverse().toString())){
                count++;
            }
        }
        return currNum;
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // System.out.println(binary(n));
        int[] x = {1,2,3,4};
        int[] y = x;
        x = new int[4];
        for(int i=0;i<x.length;i++){
            System.out.println(y[i]+" ");
        }
    }  
}
