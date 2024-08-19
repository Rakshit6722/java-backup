import java.util.*;
public class kthElementFromLinkedList { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> temp = new ArrayList();
        int data=sc.nextInt();
        temp.add(data);

        while(data!=-1){
            data = sc.nextInt();
            temp.add(data);
        }

        int x = sc.nextInt();
        System.out.println(temp.get(temp.size()-1-x));


    }
}
