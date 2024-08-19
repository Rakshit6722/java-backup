import java.util.*;
public class subsequence {

    static ArrayList<ArrayList<Integer>> subsequence(int[] arr, int idx){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        sub(arr,idx,ans,new ArrayList<>());
        return ans;
    }
    static void sub(int[] arr, int idx, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> ds){
        if(idx>=arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(arr[idx]);
        sub(arr, idx+1, ans, ds);
        ds.remove(ds.size()-1);
        sub(arr, idx+1, ans, ds);


    }
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        System.out.println(subsequence(arr, 0));
    }
}
