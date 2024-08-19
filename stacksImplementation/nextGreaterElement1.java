package stacksImplementation;
import java.util.Stack;

public class nextGreaterElement1 {
    public static void main(String[] args) {
        int[] arr = {4, 12, 5, 3, 1, 2, 5, 3, 1, 2, 4, 6};
        int[] ans = nextGreater(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    static int[] nextGreater(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack();
        int i = arr.length - 1;
        while (i >= 0) {
            while (!st.empty() && arr[i] >= st.peek()) {
                st.pop();
            }
            if (st.empty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }
            st.push(arr[i]);
            i--;
        }
        return ans;
    }
}
