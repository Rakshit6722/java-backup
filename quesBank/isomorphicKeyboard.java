import java.util.*;

public class isomorphicKeyboard{

    static boolean isIsomorphic(String a, String b){
        HashMap<Character,Character> map = new HashMap<>();

        for(int i=0;i<a.length();i++){
            char aCh = a.charAt(i);
            char bCh = b.charAt(i);

            if(map.containsKey(aCh)){
                if(map.get(aCh)!=bCh) return false;
            }
            else if(map.containsValue(bCh)) return false;
            else map.put(aCh, bCh);
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = sc.next();

        boolean check = isIsomorphic(str, str2);
        if(check) System.out.println("YES");
        else System.out.println("NO");

    }
}