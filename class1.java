// import java.util.*;

// public class class {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();

//         int count=0;
//         int sum=0;

//         for(i=0;i<t;i++){
//             int n = sc.nextInt();
//             for(int i=0;i==50;i++){
//                 if(n==50){
//                     System.out.println("0");
//                     break;
//                 }
//                 else if(n>50){
//                     n = n - 3;
//                     count++;
//                 }
//                 else{
//                     n = n + 2;
//                     sum++;
//                 }

//             }
//         }

//     }

// }
// import java.util.*;
// public class class1 {

//     public static int sortedSquares(int[] nums) {
//         for(int i=0;i<nums.length-1;i++){
//             for(int j=0;j<nums.length-1;j++){
//                 if(nums[j]>nums[j+1]){
//                     int temp = nums[j];
//                     nums[j] = nums[j+1];
//                     nums[j+1] = temp;
//                 }
//             }

//         }
//         int square = 0;
//         for(int i=0;i<nums.length;i++){
//             square = nums[i]*nums[i];
//         }

//         return square;
//     }

//     public static void main (String args[]) {

//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i = 0; i < n; i++)
//             arr[i] = sc.nextInt();

//         arr = sortedSquares(arr);
//         for(int i = 0; i < n; i++)
//         {
//             System.out.print(arr[i]+" ");
//         }
//     }

// }

// import java.util.*;

// public class class1 {
//     public static int maxArray(int arr1[], int arr2[], int n, int m) {
//         int i = 0, j = 0, sum1 = 0, sum2 = 0, result = 0;

//         while (i < n && j < m) {
//             if (arr1[i] > arr2[j]) {
//                 sum1 += arr1[i++];
//             } else if (arr1[i] < arr2[j]) {
//                 sum2 += arr2[j++];
//             } else {

//                 if (sum1 > sum2)
//                     result = sum1 + arr1[i];
//                 if (sum1 < sum2)
//                     result = sum2 + arr1[i];
//                 sum1 = 0;
//                 sum2 = 0;
//                 i++;
//                 j++;
//             }

//             while (i < n) {
//                 sum1 += arr1[i++];
//             }
//             while (j < m) {
//                 sum2 += arr2[j++];
//             }
//             if (sum1 > sum2)
//                 result += sum1;
//             if (sum1 < sum2)
//                 result += sum2;

            
//         }
//         return result;

//     }



//     public static void main(String args[]) {

//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();

//         for (int i = 0; i < t; i++) {
//             int n = sc.nextInt();
//             int m = sc.nextInt();
//             int arr1[] = new int[n];
//             int arr2[] = new int[m];
//             for (int j = 0; j < n; j++) {
//                 arr1[j] = sc.nextInt();
//             }
//             for (int j = 0; j < m; j++) {
//                 arr2[j] = sc.nextInt();
//             }

//             int ans = maxArray(arr1, arr2, n, m);
//             System.out.print(ans);
            

//         }

//     }
// }


// import java.util.*;

// public class class1{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum=0;
//         while(n!=0){
//             int rev=0;
//             rev = n%10;
//             if(rev==0){
//                 rev = 5;
//             }
//             sum = sum*10 + rev;
//             n=n/10;
//         }
//         int rev = sum;
//         int n2=0;
//         while(rev!=0){
//             int rem = n%10;
//             n2 = n2*10 + rem;
//             rem = rem/10;
//         }

//         System.out.print(n2)z;
//     }
// }

// import java.util.*;
// public class class1{
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4};
//         int[] arr1 = {5,6,7,9};
//         int[] ans = new int[arr.length+arr1.length];

//         int i = 0;
//         int j = 0;
//         for(int k=0;k<ans.length;k++){
//             if (i < arr.length && arr[i] < arr1[j]) {
//                 ans[k] = arr[i];
//                 i++;
//             }
//             else{
//                 ans[k] = arr1[j];
//                 j++;
//             }
//         }
//         System.out.println(Arrays.toString(ans));
//     }
// }

import java.util.*;

public class class1{

    static int unique(int[] arr){
        int ans = -1;
        int i = 0;
        int j = i+1;
        while(i<arr.length-1){
            if(arr[i]==arr[j]){
                arr[i]=-1;
                arr[j]=-1;
            }
            i++;
            j = i + 1;
        }

        for(int x=0;x<arr.length;x++){
            if(arr[x]!=-1) ans = arr[x];
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,2,3,3};
        System.out.println(unique(arr));

    }
}