import java.util.*;

public class oddEvenCharacter {

    static String oddEven(String ans, String str){

        for(int i=0;i<str.length();i++){
            if(i%2==0){
                char ch = (char)(str.charAt(i)+1);
                ans+=ch;
            }
            else{
                char ch = (char)(str.charAt(i)-1);
                ans+=ch;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String ans = oddEven("",str);
        System.out.println(ans);
    }
}
