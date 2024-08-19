//printing output 

// public class io {
//     public static void main(String[] args){
//         // System.out.println("Hello World"); //used to print output in next line
//         // System.out.print("Hello World\n"); //or you can use \n
//         // System.out.print("Hello World");

//         System.out.println("*");
//         System.out.println("**");
//         System.out.println("***");
//         System.out.println("****");
//         System.out.print("*****");
        
//     }
// }

//taking input
// import java.util.*;

// public class io{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();
//         //nextint() - integer
//         //nextfloat() - float
//         //next - only one word
//         //nextboolean - bool
//         //etc
//         System.out.println(name);
//     }
// }

import java.util.*;

public class io{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println("Enter another number");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.print("Sum of both the number "+sum);
    }
}
 