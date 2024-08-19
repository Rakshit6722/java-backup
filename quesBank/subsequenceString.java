import java.util.*;
public class subsequenceString {

    static ArrayList<ArrayList<Character>> sub(String str, int idx){
        ArrayList<ArrayList<Character>> ans = new ArrayList<>();
        subsequence(str,idx,ans,new ArrayList<>());
        return ans;
    }
    static void subsequence(String str, int idx, ArrayList<ArrayList<Character>> ans, ArrayList<Character> ds){
        if(idx>=str.length()){
            ans.add(new ArrayList<>(ds));
            return;
        }
        char ch = str.charAt(idx);
        ds.add(ch);
        subsequence(str, idx+1, ans, ds);
        ds.remove(ds.size()-1);
        subsequence(str, idx+1, ans, ds);
    }
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(sub(str, 0));

    }
}
