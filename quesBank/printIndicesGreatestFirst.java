import java.util.*;
public class printIndicesGreatestFirst {

    static int findMax(ArrayList<Integer> arr){
        int idx = 0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>arr.get(idx)){
                idx = i;
            }

        }
        return idx;
    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Integer> arr = new ArrayList<>();
    ArrayList<Integer> ans = new ArrayList<>();
    for(int i=0;i<n;i++){
        arr.add(sc.nextInt());
    }
    for(int i=0;i<n;i++){
        int max = findMax(arr);
        ans.add(max);
        arr.set(max,Integer.MIN_VALUE);
    }
    System.out.println(ans);
  }  
}
