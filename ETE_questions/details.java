import java.util.*;

public class details {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = n + 1;
        String[] temp = new String[n];
        for(int i=0;i<n;i++){
            temp[i] = sc.nextLine();
        }
        String comp = sc.nextLine();

        for(int i=0;i<temp.length;i++){
            String[] ans = temp[i].split(" ");
            if(ans[0].equals(comp)){
                for(int j=0;j<ans.length;j++){
                    System.out.println(ans[j]);
                }
                break;
               
            }
            
            
        }
    }

}
