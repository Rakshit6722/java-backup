import java.util.*;

public class balancedParenthesis {

    public static boolean balancedPara(String str){
        Stack<Character> st = new Stack<>();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                st.push('(');
            }
            else if(str.charAt(i)==')'&&st.empty()){
                return false;
            }
            else{
                st.pop();
            }
        }
        return st.empty();
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if(balancedPara(str)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
