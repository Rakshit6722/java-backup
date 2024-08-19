package LinkedList1;

import java.util.*;
public class practice1{
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20));
        System.out.println(diff(10, 20));
        System.out.println(diff(10, 20));
    }
    static int sum(int a, int b){
        int sum1 = a + b;
        return sum1;
    }
    static int diff(int a, int b){
        int sum1 = a - b;
        return sum1;
    }
}