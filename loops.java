import java.util.*;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // for(int i=0; i<=num; i++){
        //     System.out.print(i+"\n");
        // }

        // int i=0;
        // while(i<=num){
        //     System.out.print(i+"\n");
        //     i++;
        // }

        //sum of first n natural numbers
        int sum=0;
        for(int i=1;i<=10;i++){
            sum = num*i;
            System.out.print(num+" * "+i+" = "+sum+"\n");
        }
        
    }
}
