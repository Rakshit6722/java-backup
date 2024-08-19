import java.util.*;

public class towerOfHenoi {
    public static void towerOfHenoi(int n, String src, String hlp, String dest){
        //base case
        //transfer last 1 disk from src to dest directly and return
        if(n==1){
            System.out.println("transfer disk "+n+" from "+src+" to "+dest);
            return;
        }

        //step 1 : transfer (n-1) disks from src to hlp using dest as helper
        towerOfHenoi(n-1, src, dest, hlp);

        //step 2 : transfer remaining 1 disk from src to dest direcetly
        System.out.println("transfer disk "+n+" from "+src+" to "+dest);

        //step 3 : transfer (n-1) disks from hlp to dest using src as helper
        towerOfHenoi(n-1, hlp, src, dest);
    }


    public static void main(String[] args) {
        int n = 2;
        towerOfHenoi(n,"s","h","d");
        
    }
}
