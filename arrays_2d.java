import java.util.*;

public class arrays_2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int arr[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //search an element in 2d array
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         if(arr[i][j]==k){
        //             System.out.print(k+" found at "+i+", "+j);
        //         }
        //     }
        // }

        //Spiral order matrix




    }
}
