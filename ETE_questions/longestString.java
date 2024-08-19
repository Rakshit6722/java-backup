import java.util.*;

public class longestString {

    static int longest(String str) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count = 0;
            } else {
                count++;
                max = Math.max(max, count);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(longest(str));
    }
}
