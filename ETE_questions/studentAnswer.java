import java.util.*;
public class studentAnswer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] student = new char[n][10];

        for(int i=0;i<n;i++){
            for(int j=0;j<10;j++){
                student[i][j] = sc.next().trim().charAt(0);
            }
        }
        char[] marks = {'D','B','D','C','C','D','A','E','A','D'};
        
        int[] correct = new int[n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<10;j++){
                if(student[i][j]==marks[j]){
                    correct[i]++;
                }
            }
        }
        for(int i=0;i<correct.length;i++){
            System.out.println(correct[i]);
        }

    }
}
