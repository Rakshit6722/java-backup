public class mazepath {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        int ans = path(0,arr.length-1,0,arr.length-1);
        System.out.println(ans);
    }
    static int path(int cr, int er, int cc, int ec){
        if(cr==er && cc==ec){
            return 1;
        }
        if(cr>er || cc > ec){
            return 0;
        }

        int count = 0;
        //row
        count += path(cr+1, er, cc, ec);
        //column
        count += path(cr, er, cc+1, ec);
        
        return count;
    }
}
