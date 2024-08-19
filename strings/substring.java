import java.util.*;

public class substring {
    public static void main(String[] args) {
        // String str = "My name is Rakshit";
        // System.out.println(str.substring(3,8));//begin index included and end index
        // excluded

        // String s = "physics";
        // for(int i=2;i<4;i++){
        // System.out.println(s.substring(i));
        // }

        String s = "abcd";
        for (int i = 0; i < s.length(); i++) {
            for(int j = i+1; j<=s.length();j++){
                System.out.println(s.substring(i,j));

            }
        }
    }
}
