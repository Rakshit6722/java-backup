import java.util.*;
public class tut01 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        //adding elements
        map.put("Rakshit",22);
        map.put("Ram",25);
        map.put("Yash",23);
        map.put("Luv",17);

        // System.out.println(map.get("Rakshit"));
        // System.out.println(map.get("yug"));

        // System.out.println(map.keySet());
        // System.out.println(map.values());
        // System.out.println(map.entrySet());

        // for(String key : map.keySet()){
        //     System.out.println(key);
        // }

        // for(int key : map.values()){
        //     System.out.println(key);
        // }

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey());
        }

    }
}
