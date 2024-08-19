public class jumpGame {
    public static void main(String[] args) {
        int arr[] = {2,3,1,1,4};
        System.out.println(game(0,arr));  
    }
    static boolean game(int idx, int[] arr){
        if(idx==arr.length-1){
            return true;
        }
        int val = arr[idx];
        for(int steps=1;steps<=val;steps++){
            boolean ans = game(idx+steps,arr);
            if(ans==true){
                return true;
            }
        }
        return false;
    }
}
