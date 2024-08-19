import java.util.*;

public class largetElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        int i = 0;
        int j = 0;
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                String ij = arr[i] + arr[j];
                String ji = arr[j] + arr[i];
                if (ij.compareTo(ji) > 0)
                    continue;
                else {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int k=0;k<n;k++){
            System.out.print(arr[k]);
        }

    }
}
