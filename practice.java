// // import java.util.*;

// // public class practice {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         //average sum
// //         // int n = 1;
// //         // float sum = 0;
// //         // int a = 0;
// //         // while (n <= 10) {
// //         // a = sc.nextInt();
// //         // sum = sum + a;
// //         // n++;
// //         // }
// //         // sum = sum / 10;
// //         // System.out.println(sum);

// //         // }

// //         //star pattern half pyramid
// //         // int n = sc.nextInt();
// //         // for (int i = 0; i <=n; i++) {
// //         //     for (int j = 0; j < i; j++) {
// //         //         System.out.print("*");
// //         //     }
// //         //     System.out.print("\n");
// //         // }

// //         //factorial
// //         // int a = sc.nextInt();
// //         // int fact = 1;
// //         // boolean flag = false;
// //         // for(int i=1; i<=a; i++){
// //         //     if(a==1 || a==0){
// //         //         flag = true;
// //         //     }
// //         //     else{
// //         //         fact = fact* i;
// //         //     }
// //         // }

// //         // if(flag){
// //         //     System.out.print("1");
// //         // }
// //         // else{
// //         //     System.out.print(fact);
// //         // }

// //         int a=0;
// //         for(int i=0;i<'j';i++){
// //             a = sc.nextInt();

// //         }

// //     }
// // }

// import java.util.*;

// public class practice{
//     public static void main(String[] args) {

//         Scanner sc=new Scanner(System.in);
//         String str=sc.nextLine();
//         // // String [] ans=new String[xtr.length()];
//         // String[] ans=str.split(" ");
//         // for(int i=ans.length-1; i>=0; i--){
//         //     System.out.print(ans[i]+" ");
//         // }

//         int cnt=1;
//         for(int i=0;i<str.length();i++){

//             if(str.charAt(i)==' '){

//                 cnt++;
//             }
//         }

//         System.out.print("no of words are "+cnt+str.charAt(0)+"  "+(int)str.charAt(0)+" ");
//         for(int i=0;i<str.length();i++){

//             if(str.charAt(i)==' '){
//                 System.out.print(str.charAt(i+1)+" "+(int)str.charAt(i+1));
//                 cnt++;
//             }
//         }

//     }
// }

import java.util.*;

public class practice {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        // String ans = "" + s.charAt(0);

        // // StringBuilder sb = new StringBuilder(s.charAt(0));
        // // StringBuilder ans = new StringBuilder();
        // int count = 1;
        // for(int i = 1 ; i<s.length();i++){
        // char curr = s.charAt(i);
        // char prev = s.charAt(i-1);

        // if(curr==prev){
        // count++;
        // }
        // else{

        // ans+=count;
        // ans+=curr;
        // count = 1;

        // // ans.append(sb.charAt(i));
        // // ans.append(count);
        // // count = 1;
        // // ans.append(sb.charAt(i+1));

        // }

        // }
        // ans+=count;
        // System.out.println(ans);

        // Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        // String ans = "";
a
        // for (int i = 0; i < s.length(); i++) {
        //     char curr = s.charAt(i);
        //     if(curr>'a' && curr<'z'){
        //         ans += (char)(curr-32);
        //     }
        //     else{
        //         ans += (char)(curr+32);
        //     }
        // }
        // System.out.println(ans);

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // String arr[] = new String[n];

        // char

        // for(int i=0;i<n;i++){
        //     arr[i] = sc.next();
        // }

        // for(int i =0 ;i < n;i++){
        //     if(arr[i]==)
        // }


        // Scanner sc = new Scanner(System.in);
        // // int n = sc.nextInt();
        // int e = sc.nextInt();
        // int arr[] = new int[5];
        // int ans[] = new int[arr.length-1];
        // for(int i=0;i<arr.length;i++){
        //     arr[i] = sc.nextInt();
        // }
        // for(int i=0,k=0;i<arr.length ;i++){
        //     if(arr[i]==e){
        //         continue;
        //     }
        //     ans[k++] = arr[i];
        // }
        // for(int i=0;i<ans.length;i++){
        //    System.out.print(ans[i]+" ");
        // }
        
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int k = sc.nextInt();
        // ArrayList<Integer> li = new ArrayList<>();
        // // ArrayList<Integer> li1 = new ArrayList<>();

        // for(int i=0;i<n;i++){
        //     int x = sc.nextInt();
        //     li.add(x);
        // }
        // for(int i=0;i<n;i++){
        //     System.out.print(li.get(i)+" ");
        // }
        // // System.out.println(li);
        // for(int i = 0;i<n;i++){
        //     if(i==k){
        //         li.remove(i);
        //     }
        // }
        // System.out.println(li);

        // Scanner sc=new Scanner(System.in);
        // String xtr=sc.nextLine();
        // String gtr=sc.nextLine();
        // for(int i=0;i<xtr.length();i++){
        //     for(int j=0;j<gtr.length();j++){
        //         if(xtr.charAt(i)==gtr.charAt(j))
        //     }
        // }

        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();

        // LinkedHashSet<Character> st = new LinkedHashSet<>();
        // for(int i=0;i<str.length();i++){
        //     st.add(str.charAt(i));
        // }
        
        // for(Character ch : st){
        //     System.out.print(ch);
        // }

        int arr[] = {11,1,1,1,1,1};
       
        for(int i : arr){
            System.out.println(i);
        }

    }

}
