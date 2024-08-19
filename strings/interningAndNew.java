import java.util.*;

public class interningAndNew {

    public static void main(String[] args) {
        String str = "Hello";
        String str1 = "Hello";
        //interning
        //these both string will point to hello at same address so str1 is not a new string

        String s = new String("Hello");
        //this is a new string using new keyword
    }
}
