import java.util.*;
public class tripletFromLinkedList {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            list1.add(x);
        }
        for(int i=0;i<m;i++){
            int x = sc.nextInt();
            list2.add(x);
        }
        for(int i=0;i<k;i++){
            int x = sc.nextInt();
            list3.add(x);
        }
        int target = sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                for(int l=0;l<k;l++){
                    if(list1.get(i)+list2.get(j)+list3.get(l)==target){
                        System.out.println(list1.get(i)+" "+list2.get(j)+" "+list3.get(l));
                    }
                }
            }
        }

    }
}
