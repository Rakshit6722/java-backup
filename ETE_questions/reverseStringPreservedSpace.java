import java.util.*;
public class reverseStringPreservedSpace {
    static String reverse(String str){
        int i = 0;
        int j = str.length()-1;
        char arr[] = str.toCharArray();

        while(i<=j){
            if(arr[i]==' ') i++;
            if(arr[j]==' ') j--;
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = reverse(str);
        System.out.println(ans);
    }
}
