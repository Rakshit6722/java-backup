import java.util.*;
public class textSearchProgram {

    static ArrayList<Integer> search(String s1, String s2){
        ArrayList<Integer> ans = new ArrayList<>();
        int idx = s1.indexOf(s2);
        while(idx!=-1){
            ans.add(idx);
            idx = s1.indexOf(s2,idx+s2.length());
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.next();

        ArrayList<Integer> ans = search(s1,s2);
        if(ans.isEmpty()){
            System.out.println(-1);
        }
        else{
            System.out.println(ans);
        }
        
    }
}
