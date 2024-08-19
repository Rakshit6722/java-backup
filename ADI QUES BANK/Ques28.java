import java.util.Map;
import java.util.Scanner;

public class Ques28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] weights = {10,20,30}; //weight of necklace,bracelets and earrings resp.
        int[] price = {60,100,120}; //prices of necklace,bracelets and earrings resp.

        int ans = solve(weights,price,n,0);
        System.out.println(ans);
    }

    static int solve(int[] weights,int[] price,int capacity,int index){
        if(index == weights.length || capacity == 0){
            return 0;
        }

        if(weights[index] > capacity){
            return solve(weights,price,capacity,index+1);
        }

        //including item
        int include = price[index] + solve(weights,price,capacity-weights[index],index+1);
        //excluding items
        int exclude =  solve(weights,price,capacity,index+1);

        return Math.max(include,exclude);
    }
}
