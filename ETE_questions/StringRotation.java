import java.util.*;
public class StringRotation {

    static String reversed(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
    static String rightRotate(String str, int d){
        if(d>str.length()) return "-1";
        return str.substring(d)+str.substring(0, d);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int d = sc.nextInt();

        String rightRotate = rightRotate(str, d);
        String leftRotate = reversed(rightRotate);

        System.out.println(rightRotate);
        System.out.println(leftRotate);

    }
}
