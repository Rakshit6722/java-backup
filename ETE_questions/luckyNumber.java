import java.util.*;
public class luckyNumber {

    static boolean isLucky(int n){
        int num = n;
        String str = String.valueOf(num);
        int len = str.length();
        num = Integer.valueOf(str);
        int sum = 0;
        while(num>0){
            int rem = num%10;
            sum += Math.pow(rem, len);
            num /= 10;
        }
        if(n==sum) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isLucky(n));
    }
}
