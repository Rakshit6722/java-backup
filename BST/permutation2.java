import java.util.ArrayList;
import java.util.List;

public class permutation2 {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean isVisited[] = new boolean[nums.length];
        solve(nums, ans, temp, isVisited);
        return ans;
    }

    public static void solve(int[] nums, List<List<Integer>> ans, List<Integer> temp, boolean[] isVisited) {
        if (temp.size() == nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!isVisited[i]) {
                isVisited[i] = true;
                temp.add(nums[i]);
                solve(nums, ans, temp, isVisited);
                temp.remove(temp.size() - 1);
                isVisited[i] = false;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2};
        List<List<Integer>> ans = permute(nums);
        System.out.println(ans);

    }
}
