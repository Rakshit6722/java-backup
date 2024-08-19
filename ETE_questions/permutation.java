import java.util.*;
public class permutation { 
    static void perm(String p, String up){
        if(p.isEmpty()){
            System.out.println(up);
            return;
        }
        char ch = p.charAt(0);

        for(int i=0;i<=up.length();i++){
            String s1 = up.substring(0,i);
            String s2 = up.substring(i, up.length());

            perm(p.substring(1),s1+ch+s2);
        }
    }
    public static void main(String[] args) {
        perm("abc","");
    }
}
