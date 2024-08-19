import java.util.*;
import java.util.HashMap;

public class MinRepeatVal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
    
        }

        Map<Integer,Integer> map = new TreeMap<>();
        for(int i= 0;i<arr.length;i++){
           if(!map.containsKey(arr[i])){
            map.put(arr[i], 1);
           }else{
           map.put(arr[i], map.get(arr[i])+1);
           }
        }
        
        int ans = 0;
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue() > 1){
                ans = findIdx(arr,e.getKey());
                break;
            }
        } 
        System.out.println(ans);
    }
    static int findIdx(int[] arr,int num){
        int idx = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == num){
                idx = i;
                break;
            }
        }
        return idx;
    }
}
