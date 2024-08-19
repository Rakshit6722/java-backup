package binarySearch;

//upperBound - first arr[idx] greater than x -> arr[idx]>x

public class upperBound {
    public static void main(String[] args) {
        int arr[] = {1,2,3,7,8};
        int ans = upperBound(arr,6 , 5);
        System.out.println(ans);
    }
    public static int upperBound(int []arr, int x, int n){
        
        int s = 0;
        int e = n - 1;
        int m = s + (e-s)/2;
        int ans = n;

        while(s<=e){
            m = s + (e-s)/2;
            if(arr[m]>x){
                ans=m; 
                e = m - 1;
            }
            else{
                s = m + 1;
            }
        }
        return ans;
    }
}
