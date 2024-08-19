import java.util.*;
public class largestAmount {

    static String largestNumber(int[] arr){
        String[] str = new String[arr.length];
        for(int i=0;i<arr.length;i++){
            str[i] = String.valueOf(arr[i]);
        }
        ArrayList<String> temp = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            temp.add(str[i]);
        }
        Collections.sort(temp,Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<temp.size();i++){
            sb.append(temp.get(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(largestNumber(arr));
    }
}
