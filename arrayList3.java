import java.util.*;

public class arrayList3 {
    // public static void reverseList(ArrayList<Integer> list){
    //     int i = 0;
    //     int e = list.size() - 1;

    //     while(i<e){
    //         int  temp = Integer.valueOf(list.get(i));
    //         list.set(i, list.get(e));
    //         list.set(e, temp);

    //         i++;
    //         e--;
    //     }
    // } 

    // public static void sortDesc(ArrayList<Integer> list){
    //     for(int i=0;i<list.size();i++){
    //         if(list.get(i)<)
    //     }
    // }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // ArrayList<Integer> li  = new ArrayList<>();

        // for(int i=0;i<n;i++){
        //     int e = sc.nextInt();
        //     li.add(e);
        // }
        // System.out.println(li);
        // System.out.println();

        // // reverseList(li);
        // Collections.reverse(li);


        // System.out.println(li);

        // //ascending order
        // Collections.sort(li);
        // System.out.println(li);

        // //descending order
        // Collections.sort(li, Collections.reverseOrder());
        // System.out.println(li);

        ArrayList<String> str = new ArrayList<>();

        for(int i = 0; i < n; i++){
            String s = sc.next();
            str.add(s);
        }
        System.out.println(str);

        Collections.sort(str);
        System.out.println(str);
        Collections.sort(str, Collections.reverseOrder());
        System.out.println(str);


        
    }
}
