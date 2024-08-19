import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ques10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        subset(arr,list,0);
        System.out.println(max);
    }
    static int len = 0;
    static int max = 0;
    static void subset(int[] arr, List<Integer> list,int idx){
        if(idx == arr.length){
            if(isIncreasing(new ArrayList<>(list))){
                len = list.size();
                max = Math.max(max,len);
            }
            return;
        }

        list.add(arr[idx]);
        subset(arr,list,idx+1);
        list.remove(list.size()-1);
        subset(arr,list,idx+1);
    }
    static boolean isIncreasing(List<Integer> list){
        for (int i = 0; i < list.size()-1; i++) {
            if(list.get(i+1) < list.get(i)) return false;
        }
        return true;
    }
}
