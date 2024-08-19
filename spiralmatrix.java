import java.util.*;

//Spiral matrix

// sample i/p - 1,2,3,6,9,8,7,4,5
       //  l      r
// o/p - t[1, 2, 3]
//        [4, 5, 6]
//       b[7, 8 ,9]

// 1 2 3 row d=0
// 6 9   col d=1 
// 8 7   row d=2
// 4     col d=3

public class spiralmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[][] = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int l = 0;
        int r = m-1;
        int t = 0;
        int b = n - 1;
        int d = 0;

        while( l<=r && t<=b ){
             if(d==0){
                 for(int i=l;i<=r;i++){
                    System.out.print(arr[t][i]);
                 }
                 d=1;t++;
             }
             else if(d==1){
                for(int i=t;i<=b;i++){
                    System.out.print(arr[i][r]);
                }
                d=2;r--;
             }
             else if(d==2){
                for(int i=r;i>=l;i--){
                    System.out.print(arr[b][i]);
                }
                d=3;b--;
             }
             else if(d==3){
                for(int i=b;i>=t;i--){
                    System.out.print(arr[i][l]);
                }
                d=0;l++;
             }
             

        }




    }
}
