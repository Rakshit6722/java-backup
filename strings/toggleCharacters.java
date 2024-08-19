import java.util.*;

public class toggleCharacters {
    public static void main(String[] args) {
        String str = "PhysICS 2wallah";
        StringBuilder s = new StringBuilder(str);

        for(int i=0;i<s.length();i++){
            boolean flag = true; //capital
            char ch = s.charAt(i);
            if(ch==' ') continue;
            if(ch>='0' && ch<='9') continue;
            int ascii = (int)ch;

            if(ascii>=97){
                flag = false; //small
            }

            if(flag==true){
                ascii+=32;
                char dh = (char)ascii;
                s.setCharAt(i, dh);
            }
            else{
                ascii -= 32;
                char dh = (char)ascii;
                 s.setCharAt(i, dh);
            }
        }
        System.out.println(s);
    }
}
