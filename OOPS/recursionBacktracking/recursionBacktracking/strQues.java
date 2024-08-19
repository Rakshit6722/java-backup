package recursionBacktracking;

import java.util.*;

public class strQues {
    public static void main(String[] args) {
        String str = "baccad";
        String str1 = "";
        // System.out.println(str(str, 0));
        remove(str1, str);
        

    }

    //my code
    static String ans = "";
    static String str(String str, int idx) {
        // String ans = "";
        if (idx == str.length()) {
            return ans;
        }
        if (str.charAt(idx) == 'a') {
            return str(str, idx + 1);
        }

        ans += str.charAt(idx);
        return str(str, idx + 1);

    }

    //kunals's code
    static void remove(String p, String old){
        if(old.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = old.charAt(0);
        if(ch=='a'){
            remove(p, old.substring(1  ));
        }
        else{
            remove(p+ch, old.substring(1));
        }
    }

    static String skipApple(String str){
        if(str.isEmpty()) return "";

        if(str.startsWith("apple")){
            return skipApple(str.substring(5));
        }
        else{
            return str.charAt(0) + skipApple(str.substring(1));
            }
    }

}
