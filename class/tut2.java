import java.util.*;

public class tut2 {
	public static void main(String[] args) {
		// prime(10);
		int[] arr = {1,2,3,4,5,6,7};
		rotate(arr, 7, 3);
		System.out.println(Arrays.toString(arr));
	}
	static void rotate(int[] arr, int n, int k){
		k = k%n;
        int[] temp = new int[n];

        for(int i=n-k,j=0;i<n;i++,j++){
            temp[j] = arr[i];
        }
        for(int i=k,j=0;j<n-k;i++,j++){
            temp[i] = arr[j];
        }
        for(int i=0;i<n;i++){
            arr[i] = temp[i];
        }
	}

	// static void prime(int n) {

	// 	for (int i = 1; i <= n; i++) {
	// 		if (i == 0 || i == 1) {
	// 			continue;
	// 		}
	// 		int flag = 0;
	// 		for (int j = 2; j*j <= i; j++) {
	// 			if (i % j == 0) {
	// 				flag = 1;
	// 				break;
	// 			}

	// 		}
	// 		if (flag == 0) {
	// 			System.out.println(i+" ");
	// 		}
	// 	}
	// 	// return -1;
	// }

}
