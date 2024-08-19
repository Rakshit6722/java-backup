package String;

public class addTwoStringsAsInteger {
    // static String add(String s1, String s2){
    //     int num1 = Integer.parseInt(s1);
    //     int num2 = Integer.parseInt(s2);
    //     int sum = num1+num2;
    //     return Integer.toString(sum);
    // }

    //alternate method
    static String add(String num1, String num2){
        int i = num1.length()-1;
        int j = num2.length()-1;
        StringBuilder result = new StringBuilder();
        int carry = 0;
        while(i>=0 || j>=0 || carry>0){
            int sum = 0;
            int x = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int y = (j >= 0) ? num2.charAt(j) - '0' : 0;
            sum = x+y+carry;
            result.insert(0,sum%10);
            carry=sum/10;
            i--;
            j--;
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(add("123","123"));
    }
}
