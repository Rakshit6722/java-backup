import java.util.Arrays;

public class tut3 {
    // //second priority - static block
    // static{
    // System.out.println("hello");
    // }

    // //first priority - static keyword
    // static int a = 10;

    // //third priority - main static
    // public static void main(String[] args) {
    // // System.out.println(a);
    // System.out.println("hello world");
    // }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1};

        // System.out.println(find(arr, 1, 0));
        // int ans = countOne(arr, 1, 0, 0);
        // int ans = array(arr, 0, 0, 0);
        // System.out.println(ans);
        // int[] ans = array(arr, 1, 0, res);
        // System.out.println(Arrays.toString(ans));
        int count = countOne(arr, 1, 0, 0);
        System.out.println(Arrays.toString(array(count, 1, 0)));
        

    }

    // static int find(int[] arr, int val, int idx) {
    // if (idx == arr.length)
    // return -1;
    // int res = find(arr, val, idx + 1);
    // if (res == -1 && arr[idx] == val) {
    // res = idx;
    // return res;
    // }
    // return res;

    // }

    static int countOne(int[] arr, int val, int idx, int count) {
        // if(idx < 0 || idx >= arr.length) return 0;
        if (idx == arr.length) {
            return count;
        }

        if (arr[idx] == val) {
            return countOne(arr, val, idx + 1, count + 1);
        } else
            return countOne(arr, val, idx + 1, count);
    }

    static int[] array(int count,int val,int idx) {
        int[] ans = new int[count];
        helper(ans,val,idx,count);
        return ans;
    }
    static void helper(int[] arr, int val, int idx, int count){
        if(idx==count) return;

        arr[idx] = val;
        helper(arr, val, idx+1, count);
        

    }

    // static int[] array(int[] arr, int val, int idx, int[] res) {
    // int n = countOne(arr, val, idx, idx);

    // if (idx == n)
    // return res;
    // res[idx] = val;
    // return array(arr, val, idx + 1, res);

    // }
}
