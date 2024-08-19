import java.util.*;

public class stringmethods {
    public static void main(String[] args) {
        String str = "rakshit";

        // length
        System.out.println(str.length());

        // charAt
        System.out.println(str.charAt(2));

        // substring
        System.out.println(str.substring(3, 6));

        // concat
        String s1 = "Geeks";
        String s2 = "forGeeks";
        System.out.println(s1.concat(s2));

        // indexOf
        System.out.println(str.indexOf('k'));

        // indexof
        String s3 = "learn share learn";
        System.out.println(s3.indexOf("ar", 5));

        // lastIndexOf
        System.out.println(s3.lastIndexOf("ea"));

        // boolean equals
        // case sensitive
        Boolean out = "Geeks".equals("Geeks");
        System.out.println(out);

        // equalsIgnoreCase
        // case insensitve
        Boolean in = "Geeks".equalsIgnoreCase("geeks");
        System.out.println(in);

        // compareToIgnoreCase
        String st = "rakshit";
        String sr = "c";

        int cmp = st.compareToIgnoreCase(sr);
        System.out.println(cmp);

        // toUpperCase
        System.out.println(st.toUpperCase());

        // trim
        String t = " HEllo WORLd ";
        System.out.println(t.trim());

        //replace
        String r = st.replace('r', 'a');
        System.out.println(r);
    }
}
