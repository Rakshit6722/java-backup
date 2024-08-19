import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int rev=0;
        int rem;
        int num = a;
        while(a!=0){
            rem = a%10;
            rev = rev*10 + rem;
            a = a/10;
        }

        if(num == rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
        System.out.print(rev);
    }
    
}
