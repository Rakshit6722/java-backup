import java.util.*;
public class maxFrequencyString {

    static char maxFrequency(String str){
        Map<Character,Integer> map = new HashMap<>();

        for(int i=0;i<str.length();i++){
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), 1);
            }
            else{
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
        }

        int maxFre = -1;
        char ansKey = '0';

        for(Map.Entry<Character,Integer> e : map.entrySet()){
            if(e.getValue()>maxFre){
                maxFre = e.getValue();
                ansKey = e.getKey();
            }
        }
        return ansKey;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // System.out.println();
        System.out.println(maxFrequency(str));
    }
}
