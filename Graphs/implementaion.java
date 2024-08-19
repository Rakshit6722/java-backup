public class implementaion{
    public static void main(String[] args) {

        //using adjacency matrix
        int n = 3, m = 3;
        int[][] arr = new int[n+1][m+1];

        //edge 1---2
        arr[1][2] = 1;
        arr[2][1] = 1;

        //edge 2---3
        arr[2][3] = 1;
        arr[3][2] = 1;

        //edge 1---3
        arr[1][3] = 1;
        arr[3][1] = 1;
    }
}