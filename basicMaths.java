import java.util.*;


public class basicMaths {
    //prime factors
    // public static void main(String[] args) {
    //     int num = 345;
    //     for(int i=2;i<=num;i++){
    //         while(num%i==0){
    //             System.out.print(i+" ");
    //             num /= i;
    //         }
    //     }
    //     if(num>2){
    //         System.out.println(num);
    //     }
    // }

    //GCD of two numbers
    public static void main(String[] args) {
        int a = 4;
        int b = 2;

        int result = Math.min(a,b);
        while(result>0){
            if(a%result==0 && b%result==0){
                break;
            }
            result--;
        }
        System.out.println(result);
    }

}
