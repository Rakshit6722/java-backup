import java.util.*;

public class reverse_string {

    //time complexity -> O(n)

    public static void reverse(String str, int i){
        //base case 
        if(i==0){
            System.out.print(str.charAt(i));
            return;
        }
        System.out.print(str.charAt(i));
        reverse(str,i-1);
    }
    public static void main(String[] args) {
        String str = "abcd";
        reverse(str, str.length()-1);
        
    }
    
}
