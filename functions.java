import java.util.*;

public class functions {
    public static void printName(String name) {
        System.out.print(name);
        return;
    }

    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;

    }

    public static int fact(int a) {
        int product = 1;
        if (a == 1 || a == 0) {
            return 1;
        } else if (a < 0) {
            return 0;
        } else {
            for (int i = 1; i <= a; i++) {
                product *= i;
            }
        }
        return product;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();

        // printName(name);

        int a = sc.nextInt();
        // int b = sc.nextInt();

        int ans = fact(a);
        System.out.print(ans);

    }

    //differnce between functions and methods
    // we call functions directly whereas methods are called thorogh
    // object of calsses.

}
