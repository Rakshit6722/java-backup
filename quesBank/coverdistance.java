import java.util.*;
public class coverdistance {

    static int coverWays(int n){
        if(n<0) return 0;
        if(n==0) return 1;
        return coverWays(n-1)+coverWays(n-2)+coverWays(n-3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(coverWays(n));
    }
}
