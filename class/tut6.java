import java.util.*;

//insertion sort
public class tut6 {
    public static void main(String[] args) {
        int arr[] = {10,3,2,1,5};

        for(int i = 1;i<arr.length;i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0){
                if(arr[j]>temp){
                    arr[j+1] = arr[j];
                }
                else{
                    break;
                }
                j--;
            }
            arr[j+1] = temp;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
