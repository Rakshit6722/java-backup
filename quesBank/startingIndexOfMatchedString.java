import java.util.*;
public class startingIndexOfMatchedString {

    static int patternMatching(String str, String key){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                if(str.substring(i,j).equals(key)) return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String key = sc.next();

        System.out.println(patternMatching(str, key));
    }
}
