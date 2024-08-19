// import java.util.*;

// public class function_prac {

//     // // public static int oddSum(int n){
//     // // int sum=0;
//     // // for(int i=0;i<=n;i++){
//     // // if(i%2!=0){
//     // // sum += i;
//     // // }
//     // // }
//     // // return sum;
//     // // }

//     // // public static double circum(int n){
//     // // return 2*3.14*n;
//     // // }
//     // public static void main(String[] args) {
//     // Scanner sc = new Scanner(System.in);

//     // int a = sc.nextInt();
//     // // System.out.print(circum(a));

//     // // System.out.print(oddSum(a));

//     // public static void main(String[] args) {
//     // int positive = 0, negative = 0, zeros = 0;
//     // System.out.print("1 to continue & 0 to stop");
//     // Scanner sc = new Scanner(System.in);
//     // int n = sc.nextInt();
//     // while (n == 1) {
//     // System.out.println("Enter number");
//     // int num = sc.nextInt();

//     // if (num > 0)
//     // positive++;
//     // else if (num < 0)
//     // negative++;
//     // else
//     // zeros++;
//     // }
//     // System.out.println("1 to continue & 0 to stop");
//     // n = sc.nextInt();

//     // System.out.println("Positive " + positive);
//     // System.out.println("Negative " + negative);
//     // System.out.print("Zeros " + zeros);
//     // }

//     // //greatest common divisor
//     // public static int greatestCommon(int a, int b) {
//     //     while (a != b) {
//     //         if (a > b)
//     //             a = a - b;
//     //         else
//     //             b = b - a;
//     //     }
//     //     return b;
//     // }

//     // public static void main(String[] args) {
//     //     Scanner sc = new Scanner(System.in);
//     //     int a = sc.nextInt();
//     //     int b = sc.nextInt();

//     //     System.out.print(greatestCommon(a, b));

//     // }

// }

import java.util.*;

class function_prac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        
        String Str = sc.nextLine();
        
        System.out.println(N + " ");
        System.out.print(Str);
    }
}
