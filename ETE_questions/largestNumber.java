import java.util.*;
public class largestNumber {

    static String largest(int[] arr){
        String[] temp = new String[arr.length];
        int n = arr.length;
        for(int i=0;i<n;i++){
            temp[i] = String.valueOf(arr[i]);
        }
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(temp[i]);
        }
        Collections.sort(ans,Collections.reverseOrder());
        StringBuilder res = new StringBuilder();
        for(int i=0;i<n;i++){
            res.append(ans.get(i));
        }
        return res.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(largest(arr));
    }
}
