import java.util.*;
public class longestpalindromesubstring {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        String s = "abcba";
        LongestPalindrome(s);
    }
    public static void LongestPalindrome(String s){
        String ans = "";
        
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                if(isPalindrome(s.substring(i,j))){
                    ans += s.substring(i,j)+" ";
                }
            }
        }
        String[] arr = ans.split(" ");
         System.out.print(Arrays.toString(arr));
        
        int maxLen = Integer.MIN_VALUE;
        String a ="";
        for(int i=0;i<arr.length;i++){
            String y = arr[i];
            if(y.length() > maxLen){
                maxLen = y.length();
                a = y+"";
            }
        }
        System.out.print(a);
    }
    public static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }
}