import java.util.*;

public class isomorphicString {

    static boolean isIsomorphc(String s1, String s2){
        HashMap<Character,Character> map = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char s1Ch = s1.charAt(i);
            char s2Ch = s2.charAt(i);

            if(map.containsKey(s1Ch)){
                if(map.get(s1Ch)!=s2Ch) return false;
            }
            else if(map.containsValue(s2Ch)){
                return false;
            }else{
                map.put(s1Ch,s2Ch);
            }
        }
        return true;

    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s1 = sc.next();
       String s2 = sc.next(); 
       System.out.println(isIsomorphc(s1, s2));
    }
}
