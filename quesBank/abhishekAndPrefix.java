import java.util.*;

public class abhishekAndPrefix {
    static int max = 0;

    static Set<String> setString(String str){
        Set<String> ans = new HashSet();
        for(int i=0;i<str.length();i++){
            ans.add(str.substring(0, i));
        }
        return ans;

    }
    static void subSeq(String p, String up, Set<String> set){
        if(up.isEmpty()){
            if(set.contains(p)){
                max = Math.max(max, p.length());
                
            }
            return;
        }
        subSeq(p+up.charAt(0), up.substring(1), set);
        subSeq(p, up.substring(1), set);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.nextLine();

        Set<String> set = setString(str);

        subSeq("", str1, set);
        System.out.println(max);



    }
}
