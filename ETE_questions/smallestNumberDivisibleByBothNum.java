import java.util.*;
public class smallestNumberDivisibleByBothNum {

    static int GCD(int a, int b){
        if(b==0) return a;

        return GCD(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int lcm = (a*b)/GCD(a, b);
        System.out.println(lcm);
    }
}
