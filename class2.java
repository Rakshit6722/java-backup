// // import java.util.*;

// // public class class {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         int t = sc.nextInt();
        
// //         int count=0;
// //         int sum=0;

// //         for(i=0;i<t;i++){
// //             int n = sc.nextInt();
// //             for(int i=0;i==50;i++){
// //                 if(n==50){
// //                     System.out.println("0");
// //                     break;
// //                 }
// //                 else if(n>50){
// //                     n = n - 3;
// //                     count++;
// //                 }
// //                 else{
// //                     n = n + 2;
// //                     sum++;
// //                 }

// //             }
// //         }

// //     }
    
// // }

// import java.util.*;
// public class class {
//     public static void main(String args[]) {
//         // Your Code Here
// 		Scanner sc = new Scanner(System.in);
// 		int n = sc.nextInt();
// 		int arr[] = new int[n];
// 		int m = sc.nextInt();

// 		for(int i=0;i<n;i++){
// 			arr[i] = sc.nextInt();
// 		}

// 		for(int i=0;i<n;i++){
// 			if(arr[i]==m){
// 				System.out.println(i);
// 				break;
// 			}
// 			else{
// 				System.out.println("-1");
// 			}
// 		}


//     }
// }
//stack

// import java.util.*;

// public class class2{
// 	public static void main(String[] args) {
//         Stack st = new Stack();
//         st.push(1);
//         st.push(2);
//         st.push(3);
//         st.pop();
//     }
// }

// import java.util.*;
// public class class2 {
//     public static void main(String args[]) {

//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int nums[] = new int[n];
//         for(int i=0;i<n;i++){
//             nums[i] = sc.nextInt();
//         }
//         int size = nums.length;
//         // int result[] = new int[size];
//         int sum1 = 0;
//         int sum2 = 0;
//         for(int i=0;i<nums.length;i++){
//             sum1+=nums[i];


//         }
//         for(int i=0;i<nums.length;i++){
//             int rem=0;
//             rem = nums[i]%10;
//             sum2 = sum2*10+rem;
//             nums[i] = nums[i]/10;
//         }

//         if(sum2>sum1) System.out.print(sum2-sum1);
//         System.out.print(sum1 - sum2);
		
//     }
// }

import java.util.*;

public class class2{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        
        int arr[] = {100,60,70,80,85,65  };
        // for(int i=0;i<arr.length;i++){
        //     arr[i] = sc.nextInt();
        // }
        int n = arr.length;
        int result[] = new int[n];

        for(int i=0;i<arr.length;i++){
            int count = 0;
            for(int j=0;j<=i;j++){
                if(arr[i]>=arr[j]){
                    count++;
                }
                result[i] = count;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}