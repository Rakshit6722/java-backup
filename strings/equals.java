import java.util.*;

public class equals {
    public static void main(String[] args) {
        String str = "Hello";
        String str1 = "Hello";
        String s = new String("Hello");
        System.out.println(str==str1);
        System.out.println(str==s);
        // == only checks if both the strings have same address

        System.out.println(str.equals(s));
        //always use equals to check if two strings are equal or not
    }
}
