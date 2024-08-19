import java.util.*;
public class subSequence {
    static void subSeq(String str,String str2,int idx){
        if(idx==str.length()){
            System.out.println(str2);
            return;
        }
        char ch = str.charAt(idx);
        subSeq(str,str2+ch,idx+1);
        subSeq(str,str2,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.next();
        subSeq(str,"",0);
    }
}
