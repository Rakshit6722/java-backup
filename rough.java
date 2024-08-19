public class rough {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,7,8,9,10};
        int x = 6;
        System.out.println(ceil(arr, x));
        System.out.println(floor(arr, x));
    }
    static int ceil(int[] arr, int x){
        int ans = -1;
        int s = 0;
        int e = arr.length - 1;

        while(s<=e){
            int mid = s + (e-s)/2;

            if(arr[mid]>=x){
                ans = arr[mid];
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        return ans;
    }
    static int floor(int[] arr, int x){
        int ans = -1;
        int s = 0;
        int e = arr.length - 1;

        while(s<=e){
            int mid = s + (e-s)/2;

            if(arr[mid]<=x){
                ans = arr[mid];
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
       }
       return ans;
    }
}
