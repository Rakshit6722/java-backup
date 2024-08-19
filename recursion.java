import java.util.*;

public class recursion {

    // using recrusion
    // public static void printNum(int n) {
    //     if (n == 0) {
    //         return;
    //     }

    //     System.out.println(n);
    //     printNum(n - 1);

    // }

    // public static void printNum(int n){
    
    //     if(n==6){
    //         return;
    //     }
    //     System.out.println(n);
    //     printNum(n+1);

    // }

    // public static void printSum(int i, int n, int sum){
    //     if(i==n){
    //         sum+=i;
    //         System.out.println(sum);
    //         return;
    //     }
    //     sum += i;
    //     printSum(i+1, n, sum);
        

    // }

    public static void printFib(int a, int b, int n){
         if(n==0) return;
         int c = a+b;
         System.out.println(c);
         printFib(b, c, n-1);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

          
        // print number from 5 to 1
        //int n = 1;
        // printNum(n);
        // using simple loop
        // for(int i=n;i>0;i--){
        // System.out.println(i);
        // }


        //print number from 1 to 5
        // printNum(n);

        //sum of n numbers
        // int n = sc.nextInt();
        // printSum(1,n,0);

        //fibonacci sequence
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        printFib(a,b,n-2);



        

        sc.close();
    }
    

}
