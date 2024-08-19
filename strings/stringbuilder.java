import java.util.*;

public class stringbuilder {
    
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Rakshit");
        s.append("Chauhan");
        System.out.println(s);
        // s.setCharAt(3, 'r');
        // System.out.println(s);
        s.insert(2, 'r');
        s.deleteCharAt(2);
        s.reverse();
        s.delete(0, 4);
        System.out.println(s);

    }
}
