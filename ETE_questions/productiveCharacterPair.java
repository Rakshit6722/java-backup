import java.util.*;

public class productiveCharacterPair {

    static String pair(String str){
        StringBuilder ans = new StringBuilder();
        int i=0;
        int j=i+1;
        while(i<str.length()&&j<str.length()){
            if(str.charAt(i)>str.charAt(j)){
                ans.append(str.charAt(i));
            }
            else{
                ans.append(str.charAt(j));
            }
            i+=2;
            j=i+1;
        } 
        if(str.length()%2!=0){
            ans.append(str.charAt(i));
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(pair(str));
    }
}
