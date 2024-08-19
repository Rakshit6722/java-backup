import java.util.*;
public class robotTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        boolean[][] visited = new boolean[n][m];
        maxProfit(arr,visited,0,0,0);

    }
    static int max = 0;
    static void maxProfit(int[][] arr, boolean[][] vis, int row, int col, int profit){
        if(row==arr.length-1 && col==arr[0].length){
            profit = profit+arr[row][col];
            max = Math.max(profit,max);
            return;
        }
        if(vis[row][col]){
            return;
        }
        vis[row][col] = true;
        if(row<arr.length-1){
            maxProfit(arr, vis, row+1, col, profit+arr[row][col]);
        }
        if(col<arr[0].length-1){
            maxProfit(arr, vis, row, col+1, profit+arr[row][col]);
        }
        vis[row][col] = false;    

    }
}
