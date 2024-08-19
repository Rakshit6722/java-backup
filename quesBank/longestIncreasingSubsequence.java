import java.util.*;

public class longestIncreasingSubsequence {

    static int max = 0;
    static int len = 0;

    static void subSequence(int[] arr, ArrayList<Integer> list, int idx) {
        if (idx == arr.length) {
            if (isIncreasing(new ArrayList<>(list))) {
                len = list.size();
                max = Math.max(max, len);
            }
            return;
        }

        list.add(arr[idx]);
        subSequence(arr, list, idx + 1);
        list.remove(list.size() - 1);
        subSequence(arr, list, idx + 1);

    }

    static boolean isIncreasing(ArrayList<Integer> list) {
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i + 1) < list.get(i)) return false;
        }
        if(list.size() >= 2){
            return list.get(list.size()-2) < list.get(list.size()-1);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        subSequence(arr, ans, 0);
        System.out.println(max);

    }
}
