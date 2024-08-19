import java.util.*;

public class addingElementsInLinkedList{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> inp = new ArrayList<>();
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            String temp = sc.next();
            inp.add(temp);
        }
        String x = sc.next();
        for(int i=0;i<inp.size();i++){
            int res = inp.get(i).compareTo(x);
            if(res>0){
                ans.add(inp.get(i));
            }

            
        }
        System.out.println(ans);

    }
}