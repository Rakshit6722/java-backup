import java.util.*;

public class subsequence {
    //every character has choice to be in the string but the 
    //condition is it has to be in same order as it was in the 
    //initial string.

    public static void sub(String str, int i, String newStr){
       

        if(i==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(i);

        //to be
        sub(str, i+1, newStr+currChar);

        //not to be
          sub(str, i+1, newStr);
    }

    public static void main(String[] args) {
        String str = "abc";
        sub(str, 0, "");
        
    }
    
}
