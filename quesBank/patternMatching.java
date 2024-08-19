import java.util.*;

public class patternMatching {

    static boolean patternMatching(String a, String b){
        String[] arr = b.split(" ");
        HashMap<Character,String> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            char ch = a.charAt(i);

            if(map.containsKey(ch)){
                if(!map.get(ch).equals(arr[i])) return false;
            }else if(map.containsValue(arr[i])) return false;

            else{
                map.put(ch, arr[i]);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println(patternMatching(str, str2));

    }
}
