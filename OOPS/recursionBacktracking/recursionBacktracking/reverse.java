package recursionBacktracking;

import java.util.*;

public class reverse {

    static int sum = 0;
    static void reverse1(int n) {
        if(n==0){
            return;
        }
        int rem = n%10;
        sum = sum*10 + rem;
        reverse1(n/10);
    }

    public static void main(String[] args) {
        reverse1(1234);
        System.out.println(sum);
    }
}
