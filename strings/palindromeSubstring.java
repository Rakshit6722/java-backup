import java.util.*;

public class palindromeSubstring { 

    public static boolean subPal(String str){
        int i=0;
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // StringBuilder s = new StringBuilder(sc.nextLine());
        
        String str = "abc";
        int count = 0;

        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                if(subPal(str.substring(i, j))==true){
                    System.out.print(str.substring(i,j)+" ");
                    count++;
                }
            }
        }
        System.out.println(count);


        // StringBuilder s = new StringBuilder(str);
        // s.reverse();
        // String s1 = s +"";
        // System.out.println(s1);
        // if(str.equals(s1)){
        //     System.out.println("Palindrome");
        // }
        // else{
        //     System.out.println("Not Palindrome");
        // }

        // int i = 0;
        // int j = str.length()-1;
        // boolean flag =true;
        // while(i<j){
        //     if(str.charAt(i)!=str.charAt(j)){
        //         flag = false;
        //         break;
        //     }
        //     i++;
        //     j--;

        // }
        // if(flag) System.out.println("palindrome");
        // else System.out.println("not palindrome");
    }
}
