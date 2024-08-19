import java.util.*;
public class prepSt {
    public static void main(String[] args) {
        // System.out.println(find("Mann_Mera Lahore Aa_Jao", "Aa_Jao"));
        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int j=0;
        int i=0;
        while(i!=str.length()){
            char ch=str.charAt(i);
            if(j<arr.length && i==arr[j]){
                System.out.print('*');
                j++;
            }
            System.out.print(ch);
            i++;

        }



        // String key=sc.nextLine();

        // String[] arr=str.split(" ");
        // for(int i=0; i<arr.length; i++){
        //     System.out.println(arr[i]);
        // }
        // Arrays.sort(arr);
        // int ans=-1;
        // for(int i=0; i<arr.length; i++){
        //     if(key.equals(arr[i])){
        //         ans=i;
        //         break;
        //     }
        // }
        // System.out.println(ans);

    }
    // static int find(String str, String key){
    //     int ans = 0;
    //     String[] temp = str.split(" ");
    //     Arrays.sort(temp);
    //     for(int i=0;i<temp.length;i++){
    //         if(temp[i]==key){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
}
