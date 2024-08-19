import java.util.*;

public class reverseKGroups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        list.add(n);
        while(n != -1){
            n = sc.nextInt();
            if(n != -1) list.add(n);
        }
        int k = sc.nextInt();

        for(int i=0;i<list.size();i+=k){
            int start = i;
            int end = Math.min(i+k-1,list.size()-1);

            while(start < end){
                swap(list,start,end);
                start++;
                end--;
            }
        }
        System.out.println(list);
    }
    static void swap(List<Integer> list ,int s,int e){
        int temp = list.get(s);
        list.set(s,list.get(e));
        list.set(e,temp);
    }
    
}
