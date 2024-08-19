import java.util.*;

public class combinationSum {

    static void combinationSum(int idx, int[] arr, int target, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> ds){
        if(idx==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        else if(arr[idx]<=target){
            ds.add(arr[idx]);
            combinationSum(idx, arr, target-arr[idx], ans, ds);
            ds.remove(ds.size()-1);
        }
        combinationSum(idx+1, arr, target, ans, ds);
    }
    static ArrayList<ArrayList<Integer>> findAns(int[] arr, int target){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        combinationSum(0,arr,target,ans,new ArrayList<>());
        return ans; 
    }
    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        System.out.println(findAns(arr, 7));
    }
}
