public class Solution {

    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
    public static int countPrimes(int n) {
        int count = 0;
        for(int i = 2;i<=n;i++){
            if(i==0 || i==1){
                continue;
            }
            int flag = 0;
            if(i%2 == 0){
                continue;
            }
            for(int j=3;j*j<=i;j++){
                if(i%j==0){
                   flag=1;
                }
 
            }
            if(flag==0){
                count++;
            }
        }
        return count;
    }
}