import java.util.ArrayList;
import java.util.Scanner;

public class primefactors {

    static ArrayList<Integer> list = new ArrayList<>();

    static void primeFactors(int n, int divisor) {
        if (n <= 1) {
            return;
        }
        
        if (n % divisor == 0) {
            list.add(divisor);
            primeFactors(n / divisor, divisor);
        } else {
            primeFactors(n, divisor + 1);
        }
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeFactors(n, 2);
        System.out.println(list);
    }
}
