import java.util.*;

public class diceRoll {
    public static void main(String[] args) {
        System.out.println(roll(0, 5));
    }
    static int roll(int cp, int des){
        if(cp==des){
            return 1;
        }
        if(cp>des){
            return 0;
        }

        int count = 0;
        for(int i=1;i<=6;i++){
            int ans = roll(cp+i, des);
            count = count + ans;
        }
        return count;
    }
}
