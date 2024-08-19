import java.util.*;
public class setBits {

    static int set(int n){
        int count = 0;
        for(int i=1;i<=n;i++){
            count+=setBits(i);
        }
        return count;
    }
    static int setBits(int n){
        int count = 0;
        while(n>0){
            if((n&1)==1) count++;
            n>>=1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(set(n));
    }
}
