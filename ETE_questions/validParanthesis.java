import java.util.*;

public class validParanthesis {

    static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            if (curr == '(' || curr == '{' || curr == '[') {
                stack.push(curr);
            } else if (curr == ')' || curr == '}' || curr == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (curr == ')' && top != '(') {
                    return false;
                }
                if (curr == '}' && top != '{') {
                    return false;
                }
                if (curr == ']' && top != '[') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isValid(str) ? "Valid" : "Invalid");
    }
}
