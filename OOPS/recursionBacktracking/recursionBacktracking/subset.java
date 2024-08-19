package recursionBacktracking;
import java.util.*;

public class subset {
    public static void main(String[] args) {
        sub("", "abc");
    }
    static void sub(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        sub(p+ch, up.substring(1));
        sub(p, up.substring(1));

    }
    static void subASCII(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subASCII(p+ch, up.substring(1));
        subASCII(p, up.substring(1));
        subASCII(p+(ch+0), up.substring(1));

    }
}
