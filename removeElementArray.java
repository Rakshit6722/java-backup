import java.util.*;

public class removeElementArray {

    public static int[] removeElement(int arr[], int index){
        //check if arr is null or index is not present in array
        if(arr == null || index<0 || index>arr.length){
            return arr;
        }
        //create another array of size one less
        int newArr[] = new int[arr.length - 1];

        //remove element
        for(int i=0,k=0;i<arr.length;i++){
            if(index == i){
                continue;
            }
            newArr[k++] = arr[i];
        }
        return newArr;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6,7};

        System.out.println(Arrays.toString(arr));

        arr = removeElement(arr, 4);

        System.out.println(Arrays.toString(arr));
    }
    
}
