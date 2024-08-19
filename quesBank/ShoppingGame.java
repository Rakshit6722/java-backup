import java.util.Scanner;

public class ShoppingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int test_case = sc.nextInt();
        while(test_case-- > 0){
            int totalMoney = sc.nextInt();
            int k = sc.nextInt();

            int count = 0;
            for(int i=0;i<arr.length;i++){
                if(totalMoney%arr[i] == 0) count++;
            }
            String ans = count >= k ? "YES" : "NO";
            System.out.println(ans);
        }
    }
}
