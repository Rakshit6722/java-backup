import java.util.*;
//most frequent element in an array
public class tut02 {
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,4,1};
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
           if(!map.containsKey(arr[i])){
            map.put(arr[i],1);
           } 
           else{
            map.put(arr[i],map.get(arr[i])+1);
           }
        }
        System.out.println(map.entrySet());

        int maxFreq = -1;
        int anskey = -1;
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue()>maxFreq){
                maxFreq = e.getValue();
                anskey = e.getKey();
            }
        }
        System.out.println(anskey);
    }
}
