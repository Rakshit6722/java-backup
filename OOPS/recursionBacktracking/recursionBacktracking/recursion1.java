package recursionBacktracking;

public class recursion1 {

    // make a function that takes in a number and prints it
    // print number 1 2 3 4 5

    public static void main(String[] args) {
        print(1);
    }

    // static void print1(int n){
    // System.out.pr intln(n);
    // print2(2);
    // }
    // static void print2(int n){
    // System.out.println(n);
    // print3(3);
    // }
    // static void print3(int n){
    // System.out.println(n);
    // print4(4);
    // }
    // static void print4(int n){
    // System.out.println(n);
    // print5(5);
    // }
    // static void print5(int n){
    // System.out.println(n);
    // }

    // recursion
    static void print(int n) {

        //base condition 
        if (n == 5) {
            System.out.println(n);
            return;
        }

        System.out.println(n);
        print(n + 1);
    }

}
