import java.util.*;
public class characterInsertionInString {

    static String newString(String str, int n, int m){
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(i==n || i==m){
                ans.append("*");
                
            }
            ans.append(str.charAt(i));
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(newString(str,n,m));
    }
}
