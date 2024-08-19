import java.util.*;
public class validAnagram {

    static boolean validAnagram(String s1, String s2){
        HashMap<Character,Integer> map1 = makeMap(s1);
        HashMap<Character,Integer> map2 = makeMap(s2);
        
        return map1.equals(map2);
    }
    static HashMap<Character,Integer> makeMap(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), 1);
            }
            else{
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
        }
        return map;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(validAnagram(s1, s2));

    }
}
