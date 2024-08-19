// import java.util.*;

// public class practiceST {

//     public static boolean balancedPara(String str){
//         Stack<Character> st = new Stack<>();
//         for(int i=0;i<str.length();i++){
//             if(str.charAt(i)=='('){
//                 st.push('(');
//             }
//             else if(str.charAt(i)==')'&&st.empty()){
//                 return false;
//             }
//             else{
//                 st.pop();
//             }
//         }
//         return st.empty();

//     }
//     public static void main(String[] args) {
//         //balanceparenthesis
//         Scanner sc = new Scanner(System.in);
//         String str = sc.next();

//         if(balancedPara(str)){
//             System.out.println(true);
//         }
//         else{
//             System.out.println(false);
//         }

//     }
// }
import java.util.*;
import java.util.Collections;

public class practiceST {

    public static boolean para(String str) {
        Stack st = new Stack();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                st.push('(');
            } else if (str.charAt(i)==')' && st.empty()) {
                return false;
            } else {
                st.pop();
            }
        }
        return st.empty();
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // int i = 0;

        // while(i < n){
        // StringBuilder sb = new StringBuilder(sc.next());

        // if(sb.charAt(0) == 'D'){
        // int dlen = sb.length();
        // for(int k = 0; k < sb.length(); k++){
        // System.out.print(dlen--);
        // }
        // }

        // if(sb.charAt(0) == 'T'){
        // int tlen = 1;
        // for(int x = 0; x < sb.length(); x++){
        // System.out.print(tlen++);
        // }
        // }
        // System.out.println();
        // i++;
        // }
        // String str = "Hello";
        // String xtr = str.replace("H", "J");
        // System.out.println(xtr);

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // int binary[] = new int[100000];

        // int i = 0 ;
        // while(n>0){
        // binary[i] = n%2;
        // n = n/2;
        // i++;
        // }

        // for(int j = i - 1;j>=0;j--){
        // System.out.print(binary[j]);
        // }
        // String str = "My name is rakshit";
        // String[] arr = str.split(" ");

        // for(int i = arr.length-1;i>=0;i--){
        // System.out.print(arr[i]+" ");

        // String str = "My name is rakshit";

        // Stack<Integer> st = new Stack<>();
        // for(int i=0;i<n;i++){
        // int t = sc.nextInt();
        // st.push(t);
        // }
        // for(int i=0;i<3;i++){
        // st.pop();
        // }
        // System.out.println(st.peek());

        // int arr[] = { 1, 2, 3, 4, 5 };

        // Collections.reverse(Arrays.asList(arr));
        // System.out.println(Arrays.asList(arr));
        // for(int i=0;i<arr.length;i++){
        // System.out.println(arr[i]);
        // }

        // String str = "Abc";
        // String ans = "";

        // for (int i = 0; i <= str.length()-1; i++) {
        //     char ch = str.charAt(i);

        //     if (ch > 'a' && ch < 'z') {
        //         ans += (char) (ch - 32);

        //     } else {
        //         ans += (char) (ch + 32);

        //     }
            

        // }
        // System.out.println(ans);

        // String str = "aaabbbcdd";
        // String ans = "" + str.charAt(0);
        // int count = 0;

        // for(int i= 1 ;i<str.length();i++){
        //     char curr = str.charAt(i);
        //     char prev  = str.charAt(i-1);

        //     if(curr == prev){
        //         count++;
        //     }
        //     else{
        //         ans+=count;
        //         ans+=curr;
        //         count = 1;
        //     }
        // }
        // ans+=count;

        // System.out.println(ans);

        // int ch = (char)'a';
        // System.out.println(ch);

        // String str = "(())";
        // // Stack st = new Stack();

        // if(para(str)){
        //     System.out.println("Yes");
        // }
        // else{
        //     System.out.println("No");
        // }

        // String str = "How are you";


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        while(i<n){
            // int count = 1;
            String str = sc.next();
            

            if(str.charAt(0)=='D'){
                int dlen = str.length();
                for(int j=0;j<dlen+1;j++)
                System.out.print (dlen--);
            }

            i++;


        }



     


    }
}
