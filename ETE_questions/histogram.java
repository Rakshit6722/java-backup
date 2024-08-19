import java.util.*;
public class histogram {

    static int area(int[] area, int n){
        int maxArea = 0;
        for(int i=0;i<n;i++){
            int minHeigh = Integer.MAX_VALUE;
            for(int j=i;j<n;j++){
                minHeigh = Math.min(minHeigh,area[j]);
                maxArea = Math.max(maxArea, minHeigh*(j-i+1));
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3};
        System.out.println(area(arr,arr.length));
    }
}
