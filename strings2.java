import java.util.*;

//type of objects that can store the character of values
//similar to char array
//string are immmutable and fixed

public class strings2 {

    public static void main(String[] args) {
        //String s1 = new String("example");
        // String s1 = "example";
        // System.out.println(s1);

        // //stringbuffer
        // //these are growable and writable character sequence
        // StringBuffer s = new StringBuffer("rakshit");
        // System.out.println(s);

        // //stringbuilder
        // //it is a mutable  sequence of characters
        // StringBuilder str = new StringBuilder("Rakshit");
        // //StringBuilder str = new StringBuilder();
        // str.append("GFG");
        // System.out.println(str);

        //stringtockenizer
        //used to break string into tokens


        //strings are immutable
        // String s = "rakshit";
        // s.concat("chauhan");
        // System.out.println(s);
        //this will only print rakshit

        //assingning value to a reference variable
        // String s = "rakshit";
        // s = s.concat("chauhan");
        // System.out.println(s);

        // byte ascii[] = {71,70,71};
        // String s1 = new String(ascii);
        // System.out.println(s1);

        // String s2 = new String(ascii,1,2);
        // System.out.println(s2);

        char c[] = {'G','f','g'};
        String s1 = new String(c);
        String s2 = new String(s1);

        System.out.println(s1);
        System.out.println(s2);






    }
    
}
