public class tut4 {
    public static void main(String[] args) {

        int[] arr ={1,2,3,4,5};
        System.out.println(binarySearch(arr, 8));
        System.out.println(recursiveBinary(arr, 8, 0, arr.length-1));
        
    }
    static boolean binarySearch(int[] arr, int key){
        int s = 0;
        int e = arr.length-1;
        int m = s + (e-s) / 2;

        
        while(s<e){
            if(arr[m]==key){
                return true;
            }
            else if(key>arr[m]){
                s = m + 1;
            }
            else{
                e = m - 1;
            }
            m = s + (e-s)/2;
        }

        return false;   
        
    }

    static boolean recursiveBinary(int[] arr, int key, int s, int e){
        int m = s + (e-s) / 2;

        if(s>e){
            return false;
        }

        if(arr[m] == key){
            return true;
        }
        if(key>arr[m]){
            return recursiveBinary(arr, key, m+1, e);
        }
        return recursiveBinary(arr, key, s, m-1);
        
    }
}
